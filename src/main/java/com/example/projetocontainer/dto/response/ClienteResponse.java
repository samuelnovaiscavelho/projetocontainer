package com.example.projetocontainer.dto.response;

import com.example.projetocontainer.model.Cliente;
import com.example.projetocontainer.model.Container;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
//Todo: Classe Response para retornar objetos formatados
public class ClienteResponse {
    private Long id;

    private String nome;

    private String email;

    private LocalDate dataNascimento;

    private List<Container> containers;

    public static ClienteResponse toResponse(Cliente cliente) {
        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .dataNascimento(cliente.getDataNascimento())
                .containers(cliente.getContainers())
                .build();
    }

    public static List<ClienteResponse> toResponse(List<Cliente> clientes) {
        return clientes.stream().map(ClienteResponse::toResponse).collect(Collectors.toList());
    }
}
