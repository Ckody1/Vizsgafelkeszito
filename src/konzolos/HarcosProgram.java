package konzolos;

import java.util.ArrayList;

public class HarcosProgram {
    public static void main(String[] args) {
        ArrayList<Harcos> harcosok = new ArrayList<>();
        harcosok.add(new Harcos("Józsi", "elf", 1, 20));
        harcosok.add(new Harcos("Feri", "törp", 20, 1));
        harcosok.add(new Harcos("Pisti", 10, 10));
        harcosok.add(new Harcos("Jani", "lizard", 15, 5));
        harcosok.get(0).targyFelvesz("seprű", 3);
        harcosok.get(0).targyFelvesz("íj", 3);
        harcosok.get(0).targyFelvesz("számszeríj", 3);
        harcosok.get(0).targyFelvesz("csúzli", 3);
//        System.out.println(harcosok.get(0));
        //h.targyEldob(0);
        for (Eszkoz eszkoz : harcosok.get(0)) {
            System.out.println(eszkoz);
        }
        for (Harcos harcos : harcosok) {
            System.out.println(harcos);
        }
        
    }
    
}
