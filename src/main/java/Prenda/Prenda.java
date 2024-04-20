package Prenda;

import Prenda.Categoria.*;
import lombok.Getter;


public class Prenda {

    private Categoria categoria;
    @Getter
    private Tipo tipo;
    private Material material;
    private Color color_principal;


    public Prenda(Tipo tipo, Color color_principal, Material material, Categoria categoria) {

        if (tipo != null || color_principal != null || material != null || categoria != null) {

            this.tipo = tipo;
            this.material = material;
            this.color_principal = color_principal;
            this.categoria = categoria;
        } else {
            throw new IllegalArgumentException("La prenda no es válida y no puede ser instanciada.");
        }
    }

    public Prenda(Tipo tipo, Color color_principal, Color color_secundario, Material material, Categoria categoria){

        if (tipo != null || color_principal != null || color_secundario != null ||  material != null || categoria != null) {
            this.tipo = tipo;
            this.material = material;
            this.color_principal = color_principal;
            this.color_principal.setColor_secundario(color_secundario);
            this.categoria = categoria;
        } else {
            throw new IllegalArgumentException("La prenda no es válida y no puede ser instanciada.");
        }
    }
    public boolean esValida() {

        return (this.categoria != null &&
                this.tipo != null &&
                this.material != null &&
                this.color_principal != null &&
                this.tipo.getCategoria() == this.categoria);
    }


}
