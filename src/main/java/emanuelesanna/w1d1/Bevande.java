package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Bevande extends OggettoMenu {
    private double volumeLitri;
    private double gradazione;

    public Bevande(String name, double price, int informazioni, double volumeLitri, double gradazione) {
        super(name, price, informazioni);
        this.volumeLitri = volumeLitri;
        this.gradazione = gradazione;
    }
}
