package com.rodrigoprates.estudosapi.osworks.api.controller;

import com.rodrigoprates.estudosapi.osworks.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente c1 = new Cliente(1l,"John Snow","jaozinhodasneves@estudandoparadevjava.com","(11) 91111-1111");
        Cliente c2 = new Cliente(2l,"Ash","ash10anosparasempre@estudandoparadevjava.com","(21) 92222-2222");
        Cliente c3 = new Cliente(3l,"Ricko","rickoemorto@estudandoparadevjava.com","(31) 93333-3333");
        Cliente c4 = new Cliente(4l,"Mario","quemario@estudandoparadevjava.com","(11) 94444-4444");

        return Arrays.asList(c1, c2, c3, c4);
    }
}
