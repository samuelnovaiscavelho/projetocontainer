package com.example.projetocontainer.dto.request;

import com.example.projetocontainer.model.Cliente;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;

@Builder
@Getter
public class ClienteRequest {

    @NotNull
    @Size(min = 5, max = 255, message = "O nome deve conter entre 5 e 255 caracteres")
    private String nome;

    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "O seu email está inválido")
    private String email;

    @NotNull
    private LocalDate dataNascimento;

    @NotNull
    @Size(min = 7, max = 255, message = "A senha deve conter entre 7 e 255 caracteres")
    private String senha;

    public static Cliente toEntity(ClienteRequest clienteRequest) {
        return Cliente.builder()
                .nome(clienteRequest.getNome())
                .email(clienteRequest.getEmail())
                .dataNascimento(clienteRequest.getDataNascimento())
                .senha(clienteRequest.getSenha())
                .containers(new ArrayList<>())
                .build();
    }
}
