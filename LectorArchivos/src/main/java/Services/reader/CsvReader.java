package Services.reader;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class CsvReader implements ArchivoReader {

    @Override
    public void leerArchivo(MultipartFile archivo) throws IOException {
        System.out.println("Leyendo archivo CSV: " + archivo);

        //Usar bufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(archivo.getInputStream()));

        //Crear un Parser de Csv
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

        // Iterar sobre las líneas del archivo CSV
        for (CSVRecord csvRecord : csvParser) {
            // Procesar cada línea como sea necesario
            String nombre = csvRecord.get(0);
            String email = csvRecord.get(1);
            // Realizar validaciones u otras operaciones aquí
            System.out.println("Nombre: " + nombre + ", Email: " + email);
        }

        // Cerrar el parser y el reader
        csvParser.close();
        reader.close();
    }

}
