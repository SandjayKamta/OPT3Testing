public class Gewicht {
    private int gewicht;
    private int passagiers;
    private boolean bagageAfhandelen;
    private boolean nederlandsVliegtuig;

    public Gewicht(int gewicht, int passagiers, boolean bagageAfhandelen, boolean nederlandsVliegtuig) {
        this.gewicht = gewicht;
        this.passagiers = passagiers;
        this.bagageAfhandelen = bagageAfhandelen;
        this.nederlandsVliegtuig = nederlandsVliegtuig;
    }

    public int bepaalKosten() {
        int kosten;

        if (gewicht < 1000) {
            kosten = 100;
        } else if (gewicht < 5000) {
            kosten = 500;
        } else {
            kosten = 2500;
        }

        if (passagiers > 2) {
            kosten *= 1.5;
        }

        if (bagageAfhandelen) {
            kosten += 800;
        }

        if (nederlandsVliegtuig) {
            kosten *= 1.21;
        }

        return kosten;
    }
}
