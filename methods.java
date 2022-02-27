import java.util.ArrayList;

public class methods {

  private static double sum;
  private static double n1;
  private static double n2;
  private static double n3;
  private static double n4;
  private static double n5;

  public methods() {
    sum = 0;
    n1 = 0;
    n2 = 0;
    n3 = 0;
    n4 = 0;
    n5 = 0;
  }

  public static double sum(ArrayList<Double> list) {

    n1 = list.get(0);
    n2 = list.get(1);
    n3 = list.get(2);
    n4 = list.get(3);
    n5 = list.get(4);

    sum = n1 + n2 + n3 + n4 + n5;

    return sum;
  }

}
