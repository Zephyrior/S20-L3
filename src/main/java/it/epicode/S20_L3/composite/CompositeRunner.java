package it.epicode.S20_L3.composite;

import it.epicode.S20_L3.composite.libro.libri.Libro;
import it.epicode.S20_L3.composite.libro.pagine.Pagina;
import it.epicode.S20_L3.composite.libro.sezioni.Sezione;
import it.epicode.S20_L3.composite.libro.sottosezioni.Sottosezione;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        // Creazione di un libro
        Libro libro = new Libro();

        // Aggiunta di sezioni al libro
        Sezione sezione1 = new Sezione();
        Sezione sezione2 = new Sezione();
        libro.setSezioni(List.of(sezione1, sezione2));

        // Aggiunta di pagine alle sezioni
        Pagina pagina5 = new Pagina();
        Pagina pagina6 = new Pagina();
        Pagina pagina7 = new Pagina();
        Pagina pagina8 = new Pagina();
        sezione1.setPagine(List.of(pagina5, pagina6, pagina7, pagina8));

        // Aggiunta di sottosezioni alle sezioni
        Sottosezione sottosezione1 = new Sottosezione();
        Sottosezione sottosezione2 = new Sottosezione();
        sezione1.setSottosezioni(List.of(sottosezione1, sottosezione2));

        // Aggiunta di pagine alle sottosezioni
        Pagina pagina1 = new Pagina();
        Pagina pagina2 = new Pagina();
        Pagina pagina3 = new Pagina();
        Pagina pagina4 = new Pagina();
        sottosezione1.setPagine(List.of(pagina1, pagina2, pagina3, pagina4));

        // Calcolo del numero totale di pagine del libro
        int numeroPagine = libro.getNumeroPagine();
        System.out.println("Numero totale di pagine del libro: " + numeroPagine);
    }
}
