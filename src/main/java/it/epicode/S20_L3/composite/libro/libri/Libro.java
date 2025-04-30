package it.epicode.S20_L3.composite.libro.libri;

import it.epicode.S20_L3.composite.libro.sezioni.Sezione;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private List<Sezione> sezioni = new ArrayList<>();
    private List<String> autori = new ArrayList<>();
    private double prezzo;


    public int getNumeroPagine() {
        return sezioni.stream()
                .mapToInt(Sezione::getNumeroPagine)
                .sum();
    }
}
