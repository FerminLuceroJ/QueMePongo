import java.util.ArrayList;
import java.util.List;
import Prenda.Prenda;
public class Atuendo {
    private List<Prenda> componentes;

    public Atuendo(List<Prenda> componentes){

        this.componentes = componentes;
    }
    public void agregarPrenda(Prenda unaPrenda) {

        if(unaPrenda.esValida() && !(componentes.stream().anyMatch(prenda -> prenda.getTipo().equals(unaPrenda.getTipo()))))  {
            this.componentes.add(unaPrenda);
        } else {
            throw new IllegalArgumentException("La prenda no es válida y no puede ser agregada.");
        }
    }

}
