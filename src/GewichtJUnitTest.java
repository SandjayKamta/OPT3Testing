import org.junit.Test;
import static org.junit.Assert.*;

public class GewichtJUnitTest {

    @Test
    public void testPairwise() {
        // Test case 1: 750, 1, wel, ja - Decision: 1089
        Gewicht testCase1 = new Gewicht(750, 1, true, true);
        int expected1 = 1089;
        int actual1 = testCase1.bepaalKosten();
        assertEquals(expected1, actual1);

        // Test case 2: 750, 4, niet, nee - Decision: 150
        Gewicht testCase2 = new Gewicht(750, 4, false, false);
        int expected2 = 150;
        int actual2 = testCase2.bepaalKosten();
        assertEquals(expected2, actual2);

        // Test case 3: 2000, 1, niet, nee - Decision: 500
        Gewicht testCase3 = new Gewicht(2000, 1, false, false);
        int expected3 = 500;
        int actual3 = testCase3.bepaalKosten();
        assertEquals(expected3, actual3);

        // Test case 4: 2000, 4, wel, ja - Decision: 1875
        Gewicht testCase4 = new Gewicht(2000, 4, true, true);
        int expected4 = 1875;
        int actual4 = testCase4.bepaalKosten();
        assertEquals(expected4, actual4);

        // Test case 5: 6000, 1, niet, ja - Decision: 3025
        Gewicht testCase5 = new Gewicht(6000, 1, false, true);
        int expected5 = 3025;
        int actual5 = testCase5.bepaalKosten();
        assertEquals(expected5, actual5);

        // Test case 6: 6000, 4, wel, nee - Decision: 4550
        Gewicht testCase6 = new Gewicht(6000, 4, true, false);
        int expected6 = 4550;
        int actual6 = testCase6.bepaalKosten();
        assertEquals(expected6, actual6);
    }
}

