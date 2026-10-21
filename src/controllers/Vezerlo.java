package controllers;

import modell.JatekModell;
import view.KonzolNezet;

public class Vezerlo {

    private JatekModell modell;
    private KonzolNezet nezet;

    public Vezerlo() {
        modell = new JatekModell();
        nezet = new KonzolNezet();
    }

    public void indit() {
        nezet.kiirFeladat(modell.getLadak());
        int valasztas = nezet.bekerValasztas();
        boolean talalat = modell.ellenorizValasztas(valasztas);
        nezet.kiirEredmeny(talalat);
    }
}
