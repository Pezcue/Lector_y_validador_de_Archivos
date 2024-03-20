package Controllers;

import DTO.ArchivoDTO;
import Services.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ArchivoController {

    private final ArchivoService archivoService;
    @Autowired
    public ArchivoController(ArchivoService archivoService) {
        this.archivoService = archivoService;
    }

    @GetMapping() // metodo para cargar el archivo
    public String cargarArchivo(@RequestBody ArchivoDTO archivoDTO) throws IOException {
        // metodo para cargar el archivo

        System.out.println("Archivo cargado exitosamente");
        archivoService.procesarArchivo(archivoDTO);
        return null;
    }


}
