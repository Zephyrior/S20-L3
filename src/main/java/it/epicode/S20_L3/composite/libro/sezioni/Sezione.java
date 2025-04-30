package it.epicode.S20_L3.composite.libro.sezioni;

import it.epicode.S20_L3.composite.libro.pagine.Pagina;
import it.epicode.S20_L3.composite.libro.sottosezioni.Sottosezione;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sezione {
    private List<Sottosezione> sottosezioni = new ArrayList<>();
    private List<Pagina> pagine = new ArrayList<>();

    public int getNumeroPagine() {
        return sottosezioni.stream()
                .mapToInt(Sottosezione::getNumeroPagine)
                .sum() + pagine.size();
    }
}
