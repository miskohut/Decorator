package decoratorimpl.additions;

import decoratorimpl.Addition;
import decoratorimpl.Ingredient;

/**
 * Created by misko on 12.1.2015.
 */
public class Tomato extends Ingredient {

    public Tomato(int price, String taste, Addition addition) {
        super(price + addition.getPrice(), taste + addition.getTaste());
    }

    public Tomato(int price, String taste) {
        super(price, taste);
    }
}
