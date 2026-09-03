package com.robles.MiPrimerServidorWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // http://MiPagina.com/api
public class HelloController {

    // GET http://MiPagina.com/api/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hola desde mi primer servidor";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola " + nombre;
    }

}
