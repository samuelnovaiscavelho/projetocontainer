package com.example.projetocontainer.controller;

import com.example.projetocontainer.dto.request.ClienteRequest;
import com.example.projetocontainer.dto.response.ClienteResponse;
import com.example.projetocontainer.model.Cliente;
import com.example.projetocontainer.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> findAll() {
        return ResponseEntity.ok().body(clienteService.findAll());
    }

    @PostMapping
    public ResponseEntity<ClienteResponse> save(@Valid @RequestBody ClienteRequest clienteRequest) {
        return new ResponseEntity<>(clienteService.save(clienteRequest), HttpStatus.CREATED);
    }
}
