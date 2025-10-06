package emanuelesanna.w1d1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public abstract class OggettoMenu {
    private String name;
    private double price;
    private int informazioni;

    @Override
    public String toString() {
        // Uso di String.format per allineare il prezzo
        return String.format("%-20s - Prezzo: € %.2f  |  Calorie: %d Kcal",
                name, price, informazioni); // 'informazioni' dovrebbe essere il campo caloria
    }
}
