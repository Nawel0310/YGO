package com.example.YGOCardApp.DTO;


import lombok.Data;

@Data
public class MonstruoConNivelYDefensaDTO extends MonstruoDTO{
    private Integer nivel;
    private Integer defensa;
    private Boolean esCantante;
}
