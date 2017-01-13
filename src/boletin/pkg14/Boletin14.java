package boletin.pkg14;

/**
 *
 * @author Adry
 */
public class Boletin14 {

    public static void main(String[] args) {
        ConversorTemperaturas obx1=new ConversorTemperaturas();
        try{
            obx1.centigradosAFharenheit(85);
            obx1.centigradosAReamur(98);
        }catch(TemperaturaErradaExcepcion s){
            System.out.println(s.toString());
        }
    }
    
}
