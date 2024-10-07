public class ACTIVIDAD2 {

    public static void main(String[] args) {
        //VARIABLE HORA
        final int horas = 1;
        //VARIABLE MINUTOS
        final int minutos = 42;
        //VARIABLE SEGUNDOS
        final int segundos = 12;
        //SUMA
        int totalsegundos = (horas * 3600) + (minutos * 60) + segundos;
        //MOSTRAR RESULTADO
        System.out.println(horas + " horas " + minutos + " minutos y " + segundos + " segundos son " + totalsegundos + " segundos.");
    }
}