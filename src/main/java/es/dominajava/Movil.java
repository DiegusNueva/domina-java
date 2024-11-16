package es.dominajava;

import java.util.Objects;

public class Movil {

    private String marca;
    private String modelo;
    private String numSerie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movil movil = (Movil) o;
        return Objects.equals(marca, movil.marca) && Objects.equals(modelo, movil.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }
}
