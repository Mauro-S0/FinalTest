package it.testfinale.infrastruttura.dto;


import lombok.Data;

import java.util.List;

@Data
public class UtenteDTO {
    private Long id;
    private String nome;
    private String email;
    private List<ProdottoDTO> prodottiCarrello;
}
