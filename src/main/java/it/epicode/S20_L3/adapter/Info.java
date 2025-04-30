package it.epicode.S20_L3.adapter;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info implements DataSource {
    private String nome;
    private String cognome;
    private Date dataDiNascita;


    @Override
    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    @Override
    public int getEta() {
        Date oggi = new Date();
        if (dataDiNascita.before(oggi)) {
            return oggi.getYear() - dataDiNascita.getYear();
        } else {
            return 0;
        }
    }
}
