import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static boolean isReady = false;

    public static Scanner n = new Scanner(System.in);
    public static void main(String[] args) {

      while(!isReady) {


          System.out.println("Enter Item Price: ");
          float item1 = (int) n.nextFloat();

          System.out.println("Enter Item Price: ");
          float item2 = (int) n.nextFloat();

          float calc = AppKt.Calc((int) item1, (int) item2);

          BigDecimal n1 = BigDecimal.valueOf(calc);

          n1 = n1.setScale((int) calc, RoundingMode.HALF_UP);

          System.out.println("You Will have: $" + (n1.doubleValue()));


          isReady = true;
      }

    }

}
