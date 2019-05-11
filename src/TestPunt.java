import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {
    @Test
    public void testPuntConstructor() {
        // comprova que el constructor Punt() pugui ser cridat
        Punt p = new Punt();
    }
    @Test
    public void testPuntBuit() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(0, p.getY());
    }
    @Test
    public void testSetXAssignationCorrectament() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        p.setX(12);
        assertEquals(12, p.getX()); // Afirma que la coordenada x val 0

    }
    @Test
    public void testSetYAssignationCorrectament() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        p.setY(6);

        assertEquals(6, p.getY());
    }
    @Test
    public void testPuntDefinit() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt(3,4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }
    @Test
    public void testSuma() {
        // comprova el metode suma
        Punt p = new Punt();
        Punt a=new Punt();
        p.suma(a);
    }
    


    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}
