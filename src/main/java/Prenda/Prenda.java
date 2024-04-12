package Prenda;

import Prenda.Categoria.*;
import lombok.Getter;


public class Prenda {

    private Categoria categoria;
    @Getter
    private Tipo tipo;
    private String material;
    private String color_principal;
    private String color_secundario;


    public Prenda(Categoria categoria, Tipo tipo, String material, String color_principal){

        this.categoria = categoria;
        this.tipo = tipo;
        this.material = material;
        this.color_principal = color_principal;
    }

    public Prenda(Categoria categoria, Tipo tipo, String material, String color_principal, String color_secundario){

        this.categoria = categoria;
        this.tipo = tipo;
        this.material = material;
        this.color_principal = color_principal;
        this.color_secundario = color_secundario;
    }
    public boolean esValida() {

        return (this.categoria != null &&
                this.tipo != null &&
                this.material != null &&
                this.color_principal != null &&
                this.tipo.getCategoria() == this.categoria);
    }


}
