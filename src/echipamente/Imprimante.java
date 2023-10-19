package echipamente;

public class Imprimante extends Echipamente {
     private int ppm;
    private  int rezolutie;
    private  int p_car;
    private int mod_tiparire;
    private Imprimanta impri;



    public Imprimante(String denumire, int nr_inv, int pret, int zona_mag, Stare_produse stare, int ppm, int rezolutie, int p_car, int mod_tiparire,Imprimanta impri) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;
    }

    public int getPpm() {
        return ppm;
    }

    public int getRezolutie() {
        return rezolutie;
    }

    public int getP_car() {
        return p_car;
    }

    public int getMod_tiparire() {
        return mod_tiparire;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public void setMod_tiparire(int mod_tiparire) {
        this.mod_tiparire = mod_tiparire;
    }


    @Override
    public String toString() {
        return "Imprimante{" +
                "ppm=" + ppm +
                ", rezolutie=" + rezolutie +
                ", p_car=" + p_car +
                ", mod_tiparire=" + mod_tiparire +
                '}';
    }
}
