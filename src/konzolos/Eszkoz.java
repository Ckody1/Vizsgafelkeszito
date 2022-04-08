package konzolos;

public class Eszkoz implements Comparable<Eszkoz>{
    private String nev;
    private double suly;

    public Eszkoz(String nev, double suly) {
        this.nev = nev;
        this.suly = suly;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }

    @Override
    public int compareTo(Eszkoz o) {
        return this.nev.compareTo(o.nev);
    }
    
    
}
