package it.testfinale.infrastruttura.dto;

import lombok.Data;

@Data
public class ProdottoDTO {
    private Long id;
    private String nome;
    private Double prezzo;
}