package Prenda;

import lombok.Getter;
import lombok.Setter;
public class Tipo {

    @Getter
    private Categoria categoria;
    private String caracteristicas;


    public Tipo(Categoria categoria, String caracteristicas) {

        this.categoria = categoria;
        this.caracteristicas = caracteristicas;
    }

}
