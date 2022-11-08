package com.example.apiteste.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("/clientes")
public class ClientController {
    
    @GetMapping
    public List<Client> listar(){

    }
}
