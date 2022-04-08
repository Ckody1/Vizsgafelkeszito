package konzolos;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Harcos extends Karakter implements Iterable<Eszkoz>{
    private int ero, ugyesseg;
    private ArrayList<Eszkoz> targyak;

    public Harcos(String nev, int ero, int ugyesseg){
        this(nev, "ember", ero, ugyesseg);
    }
    
    public Harcos(String nev, String faj, int ero, int ugyesseg){
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
        targyak = new ArrayList<>();
    }

    public int getEro() {
        return ero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public static EroComparator EroRendezo(){
        return new EroComparator();
    }
    public static UgyessegComparator UgyessegRendezo(){
        return new UgyessegComparator();
    }

    

    @Override
    public ArrayList<Eszkoz> targyFelvesz(String nev, double suly) {
        targyak.add(new Eszkoz(nev, suly));
        return targyak;
    }

    @Override
    public void targyEldob(int index) {
        targyak.remove(index);
    }

    @Override
    public void targyEldob(Eszkoz eszkoz) {
        targyak.remove(eszkoz);
    }
    
    @Override
    public Iterator<Eszkoz> iterator() {
        return targyak.iterator();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------\n");
        sb.append(super.toString());
        sb.append("\nHarcos");
        sb.append("{ero = " + ero + ", ugyesseg = " + ugyesseg + "}\n");
        sb.append("Eszközök: \n");
        Collections.sort(targyak);
        for (Eszkoz eszkoz : targyak) {
            sb.append("\t" + eszkoz + "\n");
        }
        sb.append("------------------------------\n");
        
        return sb + "";
    } 
}
class EroComparator implements Comparator<Harcos>{


    @Override
    public int compare(Harcos o1, Harcos o2) {
        Collator col = Collator.getInstance();
        return col.compare(o1.getEro(), o2.getEro());
    }
}
class UgyessegComparator implements Comparator<Harcos>{


    @Override
    public int compare(Harcos o1, Harcos o2) {
        Collator col = Collator.getInstance();
        return col.compare(o1.getUgyesseg(), o2.getUgyesseg());
    }
}
