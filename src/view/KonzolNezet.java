package view;

import java.util.Scanner;
import modell.Lada;

public class KonzolNezet {
    private Scanner beolvaso;

    public KonzolNezet() {
        beolvaso = new Scanner(System.in);
    }

    public void kiirFeladat(Lada[] ladak) {
        System.out.println("3 láda közül melyik rejti a kincset?");
        System.out.println("Mindegyiken van 1 felirat, amelyek közül csak 1 igaz!");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < ladak.length; i++) {
            Lada lada = ladak[i];
            System.out.println((i + 1) + ". " + lada.getAnyag() + ": " + lada.getFelirat());
        }
    }

    public int bekerValasztas() {
        System.out.print("\nMelyik ládát választod? (1, 2, 3): ");
        int valasztas = beolvaso.nextInt();
        return valasztas - 1;
    }

    public void kiirEredmeny(boolean talalat) {
        if (talalat) {
            System.out.println("\nHell yeah! Megtaláltad a kincset!");
        } else {
            System.out.println("\nNuh uh nem talált, a láda üres. Próbáld újra!");
        }
    }
}
