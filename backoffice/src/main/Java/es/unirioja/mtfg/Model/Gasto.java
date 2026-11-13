package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "gasto")
public class Gasto extends Movimiento {

    private String imagen; // Ruta o URL de la foto del ticket
    private String estado;

    public Gasto() {
        super();
    }

    public Gasto(Gestion gestion, Categoria categoria, LocalDate fecha, String concepto, Double cantidad, String imagen, String estado) {
        super(gestion, categoria, fecha, concepto, cantidad);
        this.imagen = imagen;
        this.estado = estado;
    }

    public Gasto(Gestion gestion, Categoria categoria, LocalDate fecha, String concepto, Double cantidad) {
        super(gestion, categoria, fecha, concepto, cantidad);
        this.imagen = null;
        this.estado = "CONFIRMADO";
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}