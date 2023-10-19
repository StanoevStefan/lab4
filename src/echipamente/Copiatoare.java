package echipamente;

public class Copiatoare {
    private int p_ton;
    private int format;
    private Copiator copy;

    public Copiatoare(int p_ton,int format){
        super();
        this.p_ton=p_ton;
        this.format=format;

    }

    public int getP_ton() {
        return p_ton;
    }

    public int getFormat() {
        return format;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public void setFormat(int format) {
        this.format = format;
    }


    @Override
    public String toString() {
        return "Copiatoare{" +
                "p_ton=" + p_ton +
                ", format=" + format +
                '}';
    }
}
