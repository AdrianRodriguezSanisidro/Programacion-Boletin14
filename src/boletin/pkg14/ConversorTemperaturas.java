package boletin.pkg14;

/**
 *
 * @author Adry
 */
public class ConversorTemperaturas {
    final float centigrados=80;
    float fharenheit,reamur;
    public float centigradosAFharenheit(float centigrados)throws TemperaturaErradaExcepcion{
        if(centigrados>=80)
            throw new TemperaturaErradaExcepcion();
        else{
           fharenheit=9.0f/5.0f*centigrados+32.4f;
            System.out.println("La temperatura es de "+fharenheit+" grados fharenheit");}
        return fharenheit;
}
    public void centigradosAReamur(float centigrados)throws TemperaturaErradaExcepcion{
        if(centigrados>=80)
            throw new TemperaturaErradaExcepcion();
        else{
            reamur=4.0f/5.0f*centigrados;
            System.out.println("La temperatura es de "+reamur+" grados reamur");
        }
    }
}