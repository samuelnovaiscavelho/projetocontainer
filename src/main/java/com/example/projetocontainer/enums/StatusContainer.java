package com.example.projetocontainer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusContainer {

    //new StatusContainer("vazio")
    CHEIO("cheio"),
    VAZIO("vazio");

    private final String value;
}
