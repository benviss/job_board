import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class BoardTest {

  @Test
  public void newBoard_instantiatesCorrectly() {
    Board testBoard = new Board();
    assertEquals(true, testBoard instanceof Board);
  }

  @Test
  public void newJobtoBoard_containsCorrectly() {
    Board testBoard = new Board();
    Job newJob = new Job("Senior Developer","thing", "Do some cool developing stuff","what","what","compan7","location");
    Job newJob2 = new Job("Senior Developer","thing", "Do some cool developing stuff","what","what","compan7","location");
    testBoard.addJob(newJob);
    testBoard.addJob(newJob2);
    assertEquals(true, Board.all().contains(newJob));
    assertEquals(true, Board.all().contains(newJob2));
  }

  @Test
  public void newjob_GetsIDCorrectly() {
    Board testBoard = new Board();
    Job newJob2 = new Job("Senior Developer","thing", "Do some cool developing stuff","what","what","compan7","location");
    assertEquals(1, newJob2.getID());
  }
}
