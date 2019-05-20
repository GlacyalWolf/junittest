import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static
public class TestSegment {
    @Test
    public void testSegmentConstructorSimple(){
        Segment s=new Segment();
    }
    @Test
    public void testSegmentConstructorComplex(){
        Segment s=new Segment(1,2,3,5);
    }
    @Test
    public void testSegmentLongitud(){
        Segment s=new Segment(1,2,3,5);
        s.Longitud(s);
    }
    @Test (expected= IllegalArgumentException.class)
    public void testExepcioMenorDe0(){
        Segment s=new Segment(-2,2,3,5);
    }
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestSegment");
    }
}

