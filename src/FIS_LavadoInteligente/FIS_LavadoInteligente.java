/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FIS_LavadoInteligente;
import vista.VistaLavanderia;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import net.sourceforge.jFuzzyLogic.rule.Variable;


/**
 *
 * @author jaide
 */
public class FIS_LavadoInteligente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaLavanderia vista = new VistaLavanderia();
        vista.setVisible(true);
    }

    public String[] calcular(int ropa, int temperatura, int suciedad) {

        // Carga el archivo de lenguaje de control difuso 'FCL'
        String fileName = "src/FIS_LavadoInteligente/FCL_lavanderia.fcl";
        FIS fis = FIS.load(fileName, true);

        // En caso de error
        if (fis == null) {
            System.err.println("No se puede cargar el archivo: '" + fileName + "'");
            return new String[]{""};
        }

        // Establecer las entradas del sistema
        fis.setVariable("cantidadRopa", ropa);
        fis.setVariable("temperatura", temperatura);
        fis.setVariable("suciedad", suciedad);

        // Inicia el funcionamiento del sistema
        fis.evaluate();

        // Imprime el valor concreto de salida del sistema
        double salida = fis.getVariable("agua").getLatestDefuzzifiedValue();
        double salida1 = fis.getVariable("detergente").getLatestDefuzzifiedValue();

        // Muestra cuanto peso tiene la variable de salida en cada CD de salida
        double pertenenciaMuyBaja = fis.getVariable("agua").getMembership("muyBaja");
        double pertenenciaBaja = fis.getVariable("agua").getMembership("baja");
        double pertenenciaMedia = fis.getVariable("agua").getMembership("media");
        double pertenenciaAlta = fis.getVariable("agua").getMembership("alta");
        double pertenenciaMuyAlta = fis.getVariable("agua").getMembership("muyAlta");

        String conjuntoMayor = "";
        double gradoMayor = 0;

        // Comparar los grados de pertenencia y determinar el conjunto con mayor pertenencia
        if (pertenenciaMuyBaja >= pertenenciaBaja && pertenenciaMuyBaja >= pertenenciaMedia &&
                pertenenciaMuyBaja >= pertenenciaAlta && pertenenciaMuyBaja >= pertenenciaMuyAlta) {
            conjuntoMayor = "muyBaja";
            gradoMayor = pertenenciaMuyBaja;
        } else if (pertenenciaBaja >= pertenenciaMuyBaja && pertenenciaBaja >= pertenenciaMedia &&
                pertenenciaBaja >= pertenenciaAlta && pertenenciaBaja >= pertenenciaMuyAlta) {
            conjuntoMayor = "baja";
            gradoMayor = pertenenciaBaja;
        } else if (pertenenciaMedia >= pertenenciaMuyBaja && pertenenciaMedia >= pertenenciaBaja &&
                pertenenciaMedia >= pertenenciaAlta && pertenenciaMedia >= pertenenciaMuyAlta) {
            conjuntoMayor = "media";
            gradoMayor = pertenenciaMedia;
        } else if (pertenenciaAlta >= pertenenciaMuyBaja && pertenenciaAlta >= pertenenciaBaja &&
                pertenenciaAlta >= pertenenciaMedia && pertenenciaAlta >= pertenenciaMuyAlta) {
            conjuntoMayor = "alta";
            gradoMayor = pertenenciaAlta;
        } else {
            conjuntoMayor = "muyAlta";
            gradoMayor = pertenenciaMuyAlta;
        }

        // Obtén los valores de pertenencia de cada término de la variable "detergente"
        double pertenencia1MuyBaja = fis.getVariable("detergente").getMembership("muyBajo");
        double pertenencia1Baja = fis.getVariable("detergente").getMembership("bajo");
        double pertenencia1Media = fis.getVariable("detergente").getMembership("medio");
        double pertenencia1Alta = fis.getVariable("detergente").getMembership("alto");
        double pertenencia1MuyAlta = fis.getVariable("detergente").getMembership("muyAlto");

        // Variables para almacenar el conjunto difuso con el mayor grado de pertenencia
        String conjuntoMayorDetergente = "";
        double gradoMayorDetergente = 0;

        // Comparar los grados de pertenencia y determinar el conjunto con mayor pertenencia
        if (pertenencia1MuyBaja >= pertenencia1Baja && pertenencia1MuyBaja >= pertenencia1Media &&
                pertenencia1MuyBaja >= pertenencia1Alta && pertenencia1MuyBaja >= pertenencia1MuyAlta) {
            conjuntoMayorDetergente = "muyBaja";
            gradoMayorDetergente = pertenencia1MuyBaja;
        } else if (pertenencia1Baja >= pertenencia1MuyBaja && pertenencia1Baja >= pertenencia1Media &&
                pertenencia1Baja >= pertenencia1Alta && pertenencia1Baja >= pertenencia1MuyAlta) {
            conjuntoMayorDetergente = "baja";
            gradoMayorDetergente = pertenencia1Baja;
        } else if (pertenencia1Media >= pertenencia1MuyBaja && pertenencia1Media >= pertenencia1Baja &&
                pertenencia1Media >= pertenencia1Alta && pertenencia1Media >= pertenencia1MuyAlta) {
            conjuntoMayorDetergente = "media";
            gradoMayorDetergente = pertenencia1Media;
        } else if (pertenencia1Alta >= pertenencia1MuyBaja && pertenencia1Alta >= pertenencia1Baja &&
                pertenencia1Alta >= pertenencia1Media && pertenencia1Alta >= pertenencia1MuyAlta) {
            conjuntoMayorDetergente = "alta";
            gradoMayorDetergente = pertenencia1Alta;
        } else {
            conjuntoMayorDetergente = "muyAlta";
            gradoMayorDetergente = pertenencia1MuyAlta;
        }
        
        String[] resultados = new String[2];

        String resultado1=String.format("<html>Se recomienda usar %.1f litros de agua:\nLa cual es: %s\nCon un grado de pertenencia de:%.2f</html>", salida, conjuntoMayor, gradoMayor);
        String resultado2=String.format("<html>Se recomienda usar %.1f gramos de detergente:\nEl cual es: %s\nCon un grado de pertenencia de:%.2f</html>", salida1, conjuntoMayorDetergente, gradoMayorDetergente);

        resultados[0] = resultado1;
        resultados[1] = resultado2;
        return resultados;
    }
    
}
