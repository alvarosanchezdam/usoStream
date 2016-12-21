import java.io.Serializable;
import java.time.LocalDate;

public class Jugador implements Serializable{
    private String nombre;
    private LocalDate nacimiento;
    private int canastas;
    private int asistencias;
    private int rebotes;
    private String posicion;
    private Equipo equipo;

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Jugador(String nombre, LocalDate nacimiento, int canastas, int asistencias, int rebotes, String posicion, Equipo equipo) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.canastas = canastas;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public Jugador() {
    }




    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }


    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }


    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }


    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomnre) {
        this.nombre = nomnre;
    }


    @Override
    public String toString() {
        return "Jugador{nombre=" + nombre + ", nacimiento=" + nacimiento + ", canastas=" + canastas + ", asistencias=" + asistencias + ", rebotes=" + rebotes + ", posicion=" + posicion + '}';
    }


}