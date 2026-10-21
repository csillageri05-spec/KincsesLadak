package modell;

public class JatekModell {
    private Lada[] ladak;

    public JatekModell() {
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "én rejtem a kincset", false);
        ladak[1] = new Lada("ezüst", "nem én rejtem a kincset", true);
        ladak[2] = new Lada("bronz", "az arany hazudik", false);
    }

    public Lada[] getLadak() {
        return ladak;
    }

    public boolean ellenorizValasztas(int index) {
        return ladak[index].isKincs();
    }
}
