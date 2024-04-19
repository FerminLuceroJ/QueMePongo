package Prenda;

import Prenda.Categoria.*;
import lombok.Getter;


public class Prenda {

    private Categoria categoria;
    @Getter
    private Tipo tipo;
    private Material material;
    private Color color_principal;


    public Prenda(Categoria categoria, Tipo tipo, Material material, Color color_principal){

        this.categoria = categoria;
        this.tipo = tipo;
        this.material = material;
        this.color_principal = color_principal;
    }

    public Prenda(Categoria categoria, Tipo tipo, Material material, Color color_principal, Color color_secundario){

        this.categoria = categoria;
        this.tipo = tipo;
        this.material = material;
        this.color_principal = color_principal;
        this.color_principal.setColor_secundario(color_secundario);
    }
    public boolean esValida() {

        return (this.categoria != null &&
                this.tipo != null &&
                this.material != null &&
                this.color_principal != null &&
                this.tipo.getCategoria() == this.categoria);
    }


}
