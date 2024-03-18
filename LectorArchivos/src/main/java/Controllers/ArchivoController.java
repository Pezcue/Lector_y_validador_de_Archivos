package Controllers;

import Services.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/archivo")

public class ArchivoController {

    private final ArchiveService archiveService;

    @Autowired
    public ArchivoController(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }

    @PostMapping("/cargar") // metodo para cargar el archivo
    public String cargarArchivo(@RequestParam("archivo")MultipartFile archivo) {
        // metodo para cargar el archivo
        archiveService.cargarArchivo(archivo);
        return "Archivo cargado exitosamente";
    }

    @RequestMapping("/leer") // metodo para leer el archivo
    public String leerArchivo(MultipartFile archivo) {
        return archiveService.leerArchivo();
    }



}
