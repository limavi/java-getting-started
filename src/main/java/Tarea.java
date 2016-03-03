import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Liliana
 */
public class Tarea {
    public static String ejecutarTest(String nombreTest,List<Double> listadoX, List<Double> listadoY) {

        DecimalFormat decimales = new DecimalFormat("0.0000");

        double B1 = Operaciones.calcularB1(listadoX, listadoY);
        double B0 = Operaciones.calcularB0(listadoX, listadoY);
        double R =  Operaciones.calcularR(listadoX, listadoY);
        double R2 = Operaciones.calcularR2(listadoX, listadoY);
        double P =  Operaciones.calcularP(listadoX, listadoY, 386);

        String result = nombreTest + " B0=" + decimales.format(B0)  + " B1=" + decimales.format(B1) + " R=" + decimales.format(R) + " R2=" + decimales.format(R2) + " P=" + decimales.format(P);
        return result;
    }

}
