import java.util.ArrayList;
import java.util.Scanner;

public class exercise_1112_main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    ArrayList<Double> List = new ArrayList<>();
    methods m = new methods();
    double sum = 0;

    System.out.println("Enter 5 numbers to get their sum:");
    List.add(input.nextDouble());
    List.add(input.nextDouble());
    List.add(input.nextDouble());
    List.add(input.nextDouble());
    List.add(input.nextDouble());

    sum = m.sum(List);

    System.out.println(sum);

  }
}
