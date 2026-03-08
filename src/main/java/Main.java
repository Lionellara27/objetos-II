import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //parte NO anemica
        tiempo fecha = new tiempo();
        fecha.setFecha(2020, 4, 3);
        //adema de los sett y gett uso la logica y la opcion de mostrar
        System.out.println("--- PARTE NO ANEMICA ---");
        fecha.mostrarFechaCorta();
        fecha.mostrarFechaLarga();
        System.out.println("--------------------------------");


        //parte ANEMICA
        System.out.println("--- PARTE ANEMICAaaaaaaa ---");
        //obtengo el valor directamente de fecha y muestro!
        LocalDate dia = fecha.getFecha();
        System.out.println(dia);
    }
}