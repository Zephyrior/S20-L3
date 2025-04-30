package it.epicode.S20_L3.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Generale generale = new Generale();
        generale.setNome("Mario");
        generale.setCognome("Bianchi");

        Colonnello colonnello = new Colonnello();
        colonnello.setNome("Luigi");
        colonnello.setCognome("Verdi");
        colonnello.setResponsabile(generale);

        Maggiore maggiore = new Maggiore();
        maggiore.setNome("Giuseppe");
        maggiore.setCognome("Gialli");
        maggiore.setResponsabile(colonnello);

        Capitano capitano = new Capitano();
        capitano.setNome("Francesco");
        capitano.setCognome("Neri");
        capitano.setResponsabile(maggiore);

        Tenente tenente = new Tenente();
        tenente.setNome("Giovanni");
        tenente.setCognome("Rossi");
        tenente.setResponsabile(capitano);

        System.out.println("Controllo stipendio");
        tenente.controllaStipendio(1000.0);
    }
}
