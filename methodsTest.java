import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class methodsTest {

  @BeforeAll
  static void setUpBeforeClass() {}

  private static final double DELTA = .0000001;

  @Test
  public void methods() {
    methods m = new methods();
    ArrayList<Double> List = new ArrayList<>();
    List.add(1.0);
    List.add(2.0);
    List.add(3.0);
    List.add(0.0);
    List.add(0.0);
    double actual = m.sum(List);
    double expected = 6.0;
    assertEquals(expected, actual, DELTA);
  }

}
