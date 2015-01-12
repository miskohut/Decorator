package decoratorimpl;

/**
 * Created by misko on 12.1.2015.
 */
public class Kebab {

    Addition addition;
    private int prize;
    private String taste;

    public Kebab(Addition addition) {
        this.addition = addition;
    }

    public int getPrize() {
        return addition.getPrice();
    }

    public String getTaste() {
        return addition.getTaste();
    }
}
