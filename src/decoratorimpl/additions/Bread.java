package decoratorimpl.additions;

import decoratorimpl.Addition;
import decoratorimpl.Ingredient;

/**
 * Created by misko on 12.1.2015.
 */
public class Bread extends Ingredient {

    public Bread(int price, String taste, Addition addition) {
        super(price + addition.getPrice(), taste + addition.getTaste());
    }

    public Bread(int price, String taste) {
        super(price, taste);
    }
}
