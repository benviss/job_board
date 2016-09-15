import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Board {
  private static ArrayList<Job> mJobBoard;


  public Board() {
    mJobBoard = new ArrayList<Job>();
  }

  public void addJob(Job _newJob) {
    mJobBoard.add(_newJob);
  }

  public static ArrayList<Job> all() {
    return mJobBoard;
  }
  // public Integer getID() {
  //   return
  // }
}
