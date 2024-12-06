import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

interface Calculate {

    float calculate();
}

abstract  class Calculates_Items implements Calculate {
    public float Calculate(float a, float b) {
        return a - b;
    }

}

public class Main {

    public static boolean isReady = false;

    public static Scanner n = new Scanner(System.in);
    public static void main(String[] args) {

      while(!isReady) {


          System.out.println("Enter Item Price: ");
          float item1 = (int) n.nextFloat();

          System.out.println("Enter Item Price: ");
          float item2 = (int) n.nextFloat();



          Calculates_Items m = new Calculates_Items() {
              @Override
              public float calculate() {
                  return 0;
              }
          };
          float calc  = m.Calculate(item1, item2);

          BigDecimal n1 = BigDecimal.valueOf(calc);

          n1 = n1.setScale((int) calc, RoundingMode.HALF_UP);

          System.out.println("You Will have: $" + (n1.doubleValue()));


          isReady = true;
      }

    }

}
