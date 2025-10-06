package emanuelesanna.w1d1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Toppings extends OggettoMenu {

    public Toppings(String name, double price, int informazioni) {
        super(name, price, informazioni);
    }
}
