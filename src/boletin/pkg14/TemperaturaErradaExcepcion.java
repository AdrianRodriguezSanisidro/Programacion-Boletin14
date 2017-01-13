package boletin.pkg14;

/**
 *
 * @author Adry
 */
public class TemperaturaErradaExcepcion extends Exception{
    public TemperaturaErradaExcepcion(){
        super("A temperatura debe ser superior a 80º");
    }
    public TemperaturaErradaExcepcion(String t){
        super (t);
    }
}
