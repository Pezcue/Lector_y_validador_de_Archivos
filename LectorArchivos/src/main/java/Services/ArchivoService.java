package Services;

import DTO.ArchivoDTO;
import Services.reader.CsvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class ArchivoService {


    @Autowired
    private CsvReader csvReader;

    public void procesarArchivo(ArchivoDTO archivoDTO) throws IOException {
        List<Map<String, Object>> listaJson;
        String tipoArchivo = archivoDTO.getTipo();

        csvReader.leerArchivo(archivoDTO.getRuta());
//        if (tipoArchivo.equals(".xlsx") || tipoArchivo.equals(".xls")) {
//            listaJson = excelReader.leerArchivo(archivoDTO.getRuta());
//        } else if (tipoArchivo.equals(".csv")) {
//            listaJson = csvReader.leerArchivo(archivoDTO.getRuta());
//        } else {
//            throw new IllegalArgumentException("Tipo de archivo no soportado");
//        }

//        List<ResultadoValidacion> resultados = new ArrayList<>();
//        for (Map<String, Object> objeto : listaJson) {
//            ResultadoValidacion resultado = validarRegistro(objeto);
//            resultados.add(resultado);
//        }
//        return resultados;
    }
}