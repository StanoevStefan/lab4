package echipamente;

public class Echipamente {
    private String denumire;
    private  int nr_inv;
    private int pret;
    private int zona_mag;
    private Stare_produse stare;

    public Echipamente(String denumire, int nrInv, int pret, int zonaMag, Stare_produse stare) {
        super();
        this.denumire=denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public int getPret() {
        return pret;
    }

    public int getZona_mag() {
        return zona_mag;
    }

    public Stare_produse getStare() {
        return stare;
    }

    @Override
    public String toString() {
        return "Imprimante{" +
                "denumire=" + denumire +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag=" + zona_mag +
                '}';
    }
}








