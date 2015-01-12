package decoratorimpl;

import decoratorimpl.additions.Bread;
import decoratorimpl.additions.Meat;
import decoratorimpl.additions.Sauce;
import decoratorimpl.additions.Tomato;

/**
 * Created by misko on 12.1.2015.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Kebab kebab = new Kebab(new Bread(2, "soft, ", new Meat(10, "delicious, ", new Tomato(5, "fresh, ", new Sauce(3, "sweat")))));

        System.out.println("Price: " + kebab.getPrize());
        System.out.println("Taste " + kebab.getTaste());
    }
}
