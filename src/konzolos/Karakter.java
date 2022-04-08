package konzolos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Karakter {
    private String nev, faj;
    

    public Karakter(String nev, String faj){
        if(nev.length()>= 3){
            this.nev = nev;
        }else{
            try {
                throw new Exception("'" + nev + "' kevesebb mint 3 karakter hosszú");
            } catch (Exception ex) {
                Logger.getLogger(Karakter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.faj = faj;
        
    }
    
    public abstract ArrayList<Eszkoz> targyFelvesz(String nev, double suly);
    public abstract void targyEldob(int index);
    public abstract void targyEldob(Eszkoz eszkoz);

    @Override
    public String toString() {
        return "Karakter{" + "nev=" + nev + ", faj=" + faj + '}';
    }
    
    
}
