/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lavanderia;

/**
 *
 * @author jaide
 */
public class Lavanderia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VistaLavanderia p = new VistaLavanderia();
        p.setVisible(true);
    }

    public String calcular(double comida, int servicio) {

        // Carga el archivo de lenguaje de control difuso 'FCL'
        String fileName = "src/lavanderia/FCL_lavanderia.fcl";
        FIS fis = FIS.load(fileName, true);

        // En caso de error
        if (fis == null) {
            System.err.println("No se puede cargar el archivo: '" + fileName + "'");
            return "";
        }

        // Establecer las entradas del sistema
        fis.setVariable("servicio", servicio);
        fis.setVariable("comida", comida);

        // Inicia el funcionamiento del sistema
        fis.evaluate();

        // Muestra los gráficos de las variables de entrada y salida
        JFuzzyChart.get().chart(fis.getFunctionBlock("prop"));

        /*
        // Muestra el conjunto difuso sobre el que se calcula el COG
        Variable tip = fis.getVariable("propina");
        JFuzzyChart.get().chart(tip, tip.getDefuzzifier(), true);
        */

        // Imprime el valor concreto de salida del sistema
        double salida = fis.getVariable("propina").getLatestDefuzzifiedValue();

        // Muestra cuanto peso tiene la variable de salida en cada CD de salida
        double pertenenciaBaja = fis.getVariable("propina").getMembership("baja");
        double pertenenciaPromedio = fis.getVariable("propina").getMembership("promedio");
        double pertenenciaGenerosa = fis.getVariable("propina").getMembership("generosa");

        String recomendacion = "";

        if (pertenenciaBaja >= pertenenciaPromedio &&
                pertenenciaBaja >= pertenenciaGenerosa){

            recomendacion = "baja";
        } else if (pertenenciaPromedio >= pertenenciaBaja &&
                pertenenciaPromedio >= pertenenciaGenerosa){
            recomendacion = "promedio";
        } else if (pertenenciaGenerosa >= pertenenciaBaja &&
                pertenenciaGenerosa >= pertenenciaPromedio){
            recomendacion = "generosa";
        }

        // Muestra las reglas activadas y el valor de salida de cada una despues de aplicar las operaciones lógicas
        StringBuilder reglasUsadas = new StringBuilder();
        reglasUsadas.append("Reglas Usadas:\n");
        fis.getFunctionBlock("prop").getFuzzyRuleBlock("No1").getRules().stream().filter(r -> (r.getDegreeOfSupport() > 0)).forEachOrdered(r -> {
            reglasUsadas.append(r.toString()).append("\n");
        });

        return ("Porcentaje de propina: " + String.format("%.1f", salida) + "%" +
               "\n\n" + "Se recomienda dar una propina " + recomendacion +
               "\n\n" + reglasUsadas.toString());
    }
    
}
