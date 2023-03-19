package com.example.projetocontainer.service;

import com.example.projetocontainer.dto.request.ClienteRequest;
import com.example.projetocontainer.dto.response.ClienteResponse;
import com.example.projetocontainer.model.Cliente;
import com.example.projetocontainer.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    /** AUTOWIRED SERVE PARA FAZER A INJEÇÃO DE DEPENDENCIAS **/
    @Autowired
    private ClienteRepository clienteRepository;

    // public ClienteService(ClienteRepository clienteRepository){
    //    this.clienteRepository = clienteRepository;
    //}

    public List<ClienteResponse> findAll() {
        List<ClienteResponse> clientesConvertidos = ClienteResponse.toResponse(clienteRepository.findAll());
        return clientesConvertidos;
    }

    public ClienteResponse save(ClienteRequest clienteRequest) {
        //Valida todos os campos da requisição, se estiver correto converte para cliente
        Cliente novoCliente = ClienteRequest.toEntity(clienteRequest);

        clienteRepository.save(novoCliente);

        return ClienteResponse.toResponse(novoCliente);
    }
}
