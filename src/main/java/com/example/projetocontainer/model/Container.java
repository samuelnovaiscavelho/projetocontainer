package com.example.projetocontainer.model;

import com.example.projetocontainer.enums.CategoriaContainer;
import com.example.projetocontainer.enums.StatusContainer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "tb_container")
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @JsonIgnore
    private Cliente cliente;

    //Definido uma coluna com o nome tipo na tabela do banco, e deixando o valor obrigatorio, nullable = false
    @Column(name = "tipo", nullable = false)
    private Integer tipo;

    @Column(name = "numerocontainer", nullable = false, length = 11)
    private String numeroContainer;

    @Enumerated(EnumType.STRING)
    private StatusContainer status;

    //Enumerated lidar com Enum do tipo String
    @Enumerated(EnumType.STRING)
    private CategoriaContainer categoriaContainer;
}
