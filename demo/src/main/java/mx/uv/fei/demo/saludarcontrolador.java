{package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saludarcontrolador {
    QGetMapping("/getSaludo")
    public String saludar() {
        return "hola mundo";
    }

    GetMapping("/getDespedida")    
    public String adios() { 
        return "adios mundo";
    }

    PostMapping("/postNombre")    
    public void nombre() {
        String nombre = "Nombre";
    }
}
