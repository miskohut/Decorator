package decoratorimpl.additions;

import decoratorimpl.Addition;
import decoratorimpl.Ingredient;

/**
 * Created by misko on 12.1.2015.
 */
public class Meat extends Ingredient {

    public Meat(int price, String taste, Addition addition) {
        super(price + addition.getPrice(), taste + addition.getTaste());
    }

    public Meat(int price, String taste) {
        super(price, taste);
    }
}
