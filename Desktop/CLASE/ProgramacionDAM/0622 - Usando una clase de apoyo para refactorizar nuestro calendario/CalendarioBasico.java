
public class CalendarioBasico
{

    private int dia ;
    private int mes;
    private int año;

    /**
     * Constructor de la  class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        año = 1;
    }

    /**
     * Fijar fecha
     */
    public void fijarFecha(int nuevoDia,int nuevoMes, int nuevoAño)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        año = nuevoAño;
    }

    /**
     * metodo para obtener la fecha
     */
    public String obtenerFecha()
    {
        String textoADevolver="";
        //variables locales por cada parte de textoadevolver
        String parte1 = dia + "";
        String parte2 = mes + "";
        String parte3 = año + "";
        //cuanto mide de largo la parte 1 y si no mide 2 le añade un cero delante
        if (parte1.length()<2){
            parte1 = "0" + parte1;   
        }
        //hasta septiembre por que es 09 y luego 10
        if (mes < 10){
            parte2= "0" + parte2;  
        }
        // hasta el año 09 por que no tiene 2 digitos
        if (año < 10 ){
            parte3 = "0" + parte3;  
        }
        textoADevolver = parte1 + "-" + parte2 + "-" + parte3 ;
        return textoADevolver;
    }

    /**
     * Añadir un dia mas, avanzar un dia
     */
    public void avanzarFecha()
    {
        dia = dia +1;
        if (dia == 31){

            dia = 1;
            mes = mes +1;
        
            if (mes == 13){
                mes = 1;
                año = año +1;
            }
        }
    }
}