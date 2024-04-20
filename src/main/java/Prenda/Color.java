package Prenda;

import lombok.Getter;
import lombok.Setter;

public class Color {

    @Setter @Getter
    private Color color_secundario;

    public Color(Color color_secundario) {

        color_secundario = color_secundario;
    }
}
