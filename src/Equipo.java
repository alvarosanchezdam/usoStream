
import java.io.Serializable;
import java.time.LocalDate;

/*
 * Entidad Equipo
 */

public class Equipo implements Serializable{

    private String nombre;
    private String localidad;
    private LocalDate creacion;

    public Equipo() {
    }

    public Equipo(String nombre, String localidad, LocalDate creacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.creacion = creacion;

    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }


    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Equipo{nombre=" + nombre + ", localidad=" + localidad + ", creacion=" + creacion + '}';
    }


}
