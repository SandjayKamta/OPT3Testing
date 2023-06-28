public class Gewicht2 {
    private int gewicht2;

    public Gewicht2(int gewicht2) {
        this.gewicht2 = gewicht2;
    }

    public int bepaalKosten2() {
        if (gewicht2 < 1000) {
            return 100;
        } else if (gewicht2 < 5000) {
            return 500;
        } else {
            return 2500;
        }
    }
}
