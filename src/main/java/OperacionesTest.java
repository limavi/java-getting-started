import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 *
 * @author Liliana
 */
public class OperacionesTest {
    List<Double> x = Arrays.asList(new Double[]{4.0,5.0});
    List<Double> y = Arrays.asList(new Double[]{8.0,2.0});

    @org.junit.Test
    public void testcalcularB1() throws Exception {
        assertTrue(Operaciones.calcularB1(x,y) == -6.0);
    }

    @org.junit.Test
    public void testcalcularB0() throws Exception {
        double b1 = -6.0;
        assertTrue(Operaciones.calcularB0(x,y) == 32.0);
    }

    @org.junit.Test
    public void testsumatoriaListaXListaDouble() throws Exception {
        assertTrue(Operaciones.sumatoriaListaXListaDouble(x,y) == 42);
    }

    @org.junit.Test
    public void testCalcularMedia() throws Exception {
        assertTrue(Operaciones.calcularMedia(x) == 4.5);
    }

    @org.junit.Test
    public void testcalcularR() throws Exception {
        assertTrue(Operaciones.calcularR(x,y) == -1.0);
    }
}