package calculadorestadistico;

/**
 * Programa implementado con listas encadenadas para obtener datos estadisticos.
 * @author Nicolás Osorio
 * @version 1.0
 */
public class CalculadorEstadistico {

    /** Metodo principal en el cual al final se muestra al usuario la información.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataRecollector a = new DataRecollector();
        MyLinkedList data= a.readTxt("datos.txt");
        DataOperator op = new DataOperator(data);
        float mean=op.meanCalculator();
        System.out.println("LA MEDIA ES DE:");
        System.out.println(mean);
        System.out.println("LA DESVIACIÓN ESTANDARD ES DE:");
        System.out.println(op.standartDeviationCalculator(mean));
    }    
}
