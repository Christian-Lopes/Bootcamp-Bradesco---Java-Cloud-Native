import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        // Number valor = Double.valueOf("a1.75");
        try {
            Number valor = NumberFormat.getInstance().parse("a123");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
