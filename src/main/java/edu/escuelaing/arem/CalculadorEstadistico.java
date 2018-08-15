/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorestadistico;

/**
 *
 * @author 2110432
 */
public class CalculadorEstadistico {

    /**
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
