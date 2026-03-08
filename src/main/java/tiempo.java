import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class tiempo {
    LocalDate fecha;

    //FORMA ANEMICA solo mando datos y recibo!!-----------------------------
    public void setFecha(int año, int mes, int dia) {
        this.fecha = LocalDate.of(año, mes, dia);
    }


    public LocalDate getFecha() {
        return this.fecha;
    }
    //--------------------------------------------------------------------


    //forma NO anemica tengo la "logica aca" //////////////////////////////////////////////////////////
    public void mostrarFechaLarga() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));

        System.out.println(fecha.format(formato));
    }

    public void mostrarFechaCorta() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(fecha.format(formato));
    }
    // ////////////////////////////////////////////////////////////////////

}