package Services.reader;

import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import java.io.IOException;


public class ExcelReader implements ArchivoReader {

    @Override
    public void leerArchivo(MultipartFile archivo) throws IOException {
        // Obtener archivo excel
        System.out.println("Leyendo archivo Excel: " + archivo);
        Workbook workbook = new XSSFWorkbook(archivo.getInputStream());

        //Obtener la 1era hoja
        Sheet sheet = workbook.getSheetAt(0);

        //Iterar sobre las filas
        for (Row row : sheet) {
            //Iterar sobre las celdas
            for (Cell cell : row) {
                //Procesar cada celda como sea necesario
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    case BLANK:
                        System.out.print("BLANK" + "\t");
                        break;
                    default:
                        System.out.print("DEFAULT" + "\t");
                }
            }
            System.out.println(); //Nueva línea
        }

        //Cerrar el workbook
        workbook.close();

    }
}
