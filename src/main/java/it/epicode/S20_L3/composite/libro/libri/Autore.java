package it.epicode.S20_L3.composite.libro.libri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autore {
    private String nome;
    private String cognome;
}
