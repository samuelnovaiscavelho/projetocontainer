package com.example.projetocontainer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CategoriaContainer {

    IMPORTACAO("importacao"),
    EXPORTACAO("exportacao");

    private final String value;

}
