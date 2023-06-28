import org.junit.Test;
import static org.junit.Assert.*;

public class GewichtJUnitTest2 {

    @Test
    public void testGewicht2() {
        // Equivalentieklasse 1: Gewicht < 1000 kg, besluit = betaalt 100 euro
        Gewicht2 testCase1 = new Gewicht2(0);
        int expected1 = 100;
        int actual1 = testCase1.bepaalKosten2();
        assertEquals(expected1, actual1);

        Gewicht2 testCase2 = new Gewicht2(999);
        int expected2 = 100;
        int actual2 = testCase2.bepaalKosten2();
        assertEquals(expected2, actual2);

        // Equivalentieklasse 2: 1000 <= Gewicht < 5000 kg, besluit = betaalt 500 euro
        Gewicht2 testCase3 = new Gewicht2(1000);
        int expected3 = 500;
        int actual3 = testCase3.bepaalKosten2();
        assertEquals(expected3, actual3);

        Gewicht2 testCase4 = new Gewicht2(4999);
        int expected4 = 500;
        int actual4 = testCase4.bepaalKosten2();
        assertEquals(expected4, actual4);

        // Equivalentieklasse 3: Gewicht >= 5000 kg, besluit = betaalt 2500 euro
        Gewicht2 testCase5 = new Gewicht2(5000);
        int expected5 = 2500;
        int actual5 = testCase5.bepaalKosten2();
        assertEquals(expected5, actual5);

        Gewicht2 testCase6 = new Gewicht2(50001);
        int expected6 = 2500;
        int actual6 = testCase6.bepaalKosten2();
        assertEquals(expected6, actual6);
    }
}
