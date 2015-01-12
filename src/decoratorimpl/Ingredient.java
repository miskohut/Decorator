package decoratorimpl;

import decoratorimpl.Addition;

/**
 * Created by misko on 12.1.2015.
 */
public abstract class Ingredient implements Addition {
    private int price;
    private String taste;

    public Ingredient(int price, String taste) {
        this.price = price;
        this.taste = taste;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getTaste() {
        return taste;
    }
}
