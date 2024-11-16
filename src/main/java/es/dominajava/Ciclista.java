package es.dominajava;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ciclista {
    private String nombre;
    private Date fechaNacimiento;
    private LocalDate otraFecha;
    private List<Bicicleta> bicicletas;

    public Ciclista(String nombre, Date fechaNacimiento, LocalDate otraFecha) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.otraFecha = otraFecha;
        this.bicicletas = new ArrayList<>();
    }

    public void anadirBicicleta(Bicicleta bici) {
        bicicletas.add(bici);
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", otraFecha=" + otraFecha +
                ", bicicletas=" + bicicletas +
                '}';
    }
}
