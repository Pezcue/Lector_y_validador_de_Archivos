package Services.reader;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ArchivoReader {
    List<Map<String, Object>> leerArhcivo(String contenidoArchivo);

    //Ruta archivo
    void leerArchivo(MultipartFile archivo) throws IOException;

}
