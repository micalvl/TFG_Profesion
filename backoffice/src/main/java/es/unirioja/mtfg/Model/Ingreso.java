package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ingreso")
public class Ingreso extends Movimiento {

    public Ingreso() {
        super();
    }

    public Ingreso(Gestion gestion, Categoria categoria, LocalDate fecha, String concepto, Double cantidad) {
        super(gestion, categoria, fecha, concepto, cantidad);
    }
}