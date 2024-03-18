package Services;

import Controllers.ArchivoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ArchiveService {
    private final ArchiveService ArchivoService;

    @Autowired
    public ArchiveService(ArchiveService archiveService) {
        this.ArchivoService = archiveService;
    }

    public void procesarArchivo(MultipartFile archivo) throws IOException {
        //Llama al metodo para leer y procesar el archivo del lector correspondiente
        ArchivoController archivoReader = null;
        archivoReader.leerArchivo(archivo);
        
        //Llama al metodo para cargar el archivo al servicio correspondiente
        ArchivoService.cargarArchivo(archivo);
        
        //Llama al metodo para enviar el archivo al servicio correspondiente
        ArchivoService.enviarArchivo(archivo);
    }

    private void enviarArchivo(MultipartFile archivo) {
    }

    public void cargarArchivo(MultipartFile archivo) {
    }
}
