package echipamente;

public class SistemeCalcul {
    private final int tip_mon;
    private final int vit_proc;
    private final int c_hdd;

    public SistemeCalcul(int tip_mon, int vit_proc, int c_hdd) {
        super();
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
    }

    @Override
    public String toString() {
        return "(" + tip_mon + "," + vit_proc + "," + c_hdd + ")";
    }
}