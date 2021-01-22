package ej25;

import java.util.Objects;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Cancion {

    private String titulo;
    private String autor;
    private int year;

    public Cancion(String titulo, String autor, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.autor);
        hash = 89 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    
}
