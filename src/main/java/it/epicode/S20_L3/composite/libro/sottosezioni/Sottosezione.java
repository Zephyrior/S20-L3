package it.epicode.S20_L3.composite.libro.sottosezioni;

import it.epicode.S20_L3.composite.libro.pagine.Pagina;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sottosezione {
    private List<Pagina> pagine = new ArrayList<>();


    public int getNumeroPagine() {
        return pagine.size();
    }
}
