package it.epicode.S20_L3.adapter;

public class StampaDataSource {
    public static void stampaInfo(DataSource ds) {
        System.out.println();
        System.out.println("Nome Completo: " + ds.getNomeCompleto());
        System.out.println("Età: " + ds.getEta());
    }
}
