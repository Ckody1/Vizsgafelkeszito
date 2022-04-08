package konzolos;

public class Harcos extends Karakter{
    private int ero, ugyesseg;

    public Harcos(int ero, int ugyesseg) {
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    @Override
    public String toString() {
        return "Harcos{" + "ero=" + ero + ", ugyesseg=" + ugyesseg + '}';
    }
    
    
}
