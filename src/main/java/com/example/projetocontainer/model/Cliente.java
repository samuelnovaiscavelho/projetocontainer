package com.example.projetocontainer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "dataNascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "senha", nullable = false)
    private String senha;

    //TODO: MERGE -Atualiza os filhos quando  Mapeamento de relacionamento bidirecionais
    //TODO: PERSIST Mapeamento para salvar todos os objetos
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Container> containers;
}
