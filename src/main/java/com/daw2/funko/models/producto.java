package com.daw2.funko.models;

import java.math.BigDecimal;

public record producto(
    Long id,
    String nombre,
    String desc,
    BigDecimal precio,
    Integer unidades
)
{}
