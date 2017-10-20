
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JTest {
  Project simple_example, simple_cycle, complex_cycle, complex_graph;

  @Before
  public void setUp(){
    simple_example = new Project(
        new String[][]{{"A", "C"}, {"C", "D"}, {"B", "C"}}
    );
    simple_cycle = new Project(new String[][]{{"A", "A"}});
    complex_cycle = new Project(new String[][]{{"A", "B"}, {"B", "A"}});
    complex_graph = new Project(
        new String[][]{
            {"A", "C"}, {"C", "D"}, {"B", "C"},
            {"A", "E"}, {"B", "F"}, {"E", "G"},
            {"D", "G"}, {"F", "G"}, {"C", "E"},
            {"C", "F"}
          }
    );
  }

  @Test
  public void test_simple_example_1() {
    assertFalse(simple_example.isWellSorted(new String[]{"C", "D", "B", "A"}));
  }

  @Test
  public void test_cycle_1() {
    assertFalse(simple_cycle.isWellSorted(new String[]{"A", "A"}));
  }
  @Test
  public void test_complex_cycle_1() {
    assertFalse(complex_cycle.isWellSorted(new String[]{"A", "A"}));
  }
}
    