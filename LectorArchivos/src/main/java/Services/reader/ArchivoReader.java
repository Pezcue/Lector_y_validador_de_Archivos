package Services.reader;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
public interface ArchivoReader {
    //Ruta archivo
    void leerArchivo(MultipartFile archivo) throws IOException;

}
