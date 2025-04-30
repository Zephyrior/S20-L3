package it.epicode.S20_L3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        LocalDate localDate = LocalDate.of(1990, 5, 15);
        Date birthDate = Date.from(localDate.atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());

        UserData userData = new UserData();
        Info info = new Info("Mario", "Rossi", birthDate);
        userData.getData(info);
        System.out.println("Nome Completo: " + info.getNomeCompleto());
        System.out.println("Età: " + info.getEta());
    }
}
