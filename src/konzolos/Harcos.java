package konzolos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Harcos extends Karakter implements Iterable<Eszkoz>{
    private int ero, ugyesseg;
    private ArrayList<Eszkoz> targyak;

    public Harcos(String nev, String faj, int ero, int ugyesseg){
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
        targyak = new ArrayList<>();
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
