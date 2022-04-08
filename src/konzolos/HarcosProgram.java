package konzolos;

public class HarcosProgram {
    public static void main(String[] args) {
        Harcos h = new Harcos("Józsi", "elf", 1, 20);
        h.targyFelvesz("seprű", 3);
        h.targyFelvesz("íj", 3);
        h.targyFelvesz("számszeríj", 3);
        h.targyFelvesz("csúzli", 3);
        System.out.println(h);
        //h.targyEldob(0);
        for (Eszkoz eszkoz : h) {
            System.out.println(eszkoz);
        }
    }
    
}
