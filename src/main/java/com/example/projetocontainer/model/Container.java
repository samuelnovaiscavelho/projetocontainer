package com.example.projetocontainer.model;

import com.example.projetocontainer.enums.StatusContainer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

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
    private Cliente cliente;

    //Definido uma coluna com o nome tipo na tabela do banco, e deixando o valor obrigatorio, nullable = false
    @Column(name = "tipo", nullable = false)
    private Integer tipo;

    @Column(name = "numerocontaine", nullable = false, length = 11)
    private String numeroContainer;

    private StatusContainer status;


}
