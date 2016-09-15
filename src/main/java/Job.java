import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Job {
  private String mJobTitle;
  private String mJobIndustry;
  private String mJobDescription;
  private String mWage;
  private String mHours;
  private String mCompany;
  private String mLocation;
  private Date mDate;
  private int mJobID;
  private static ArrayList<Job> mJobList = new ArrayList<Job>();

  public Job(String _JobTitle, String _JobIndustry, String _JobDescription, String _Wage, String _Hours, String _Company, String _Location) {
    mJobTitle = _JobTitle;
    mJobIndustry = _JobIndustry;
    mJobDescription = _JobDescription;
    mWage = _Wage;
    mHours = _Hours;
    mCompany = _Company;
    mLocation = _Location;
    mDate = new Date();
    mJobList.add(this);
    mJobID = mJobList.size();
  }

  public String getTitle() {
    return mJobTitle;
  }
  public String getField() {
    return mJobIndustry;
  }
  public String getDescription() {
    return mJobDescription;
  }
  public String getWage() {
    return mWage;
  }
  public String getHours() {
    return mHours;
  }
  public String getCompany() {
    return mCompany;
  }
  public String getLocation() {
    return mLocation;
  }
  public Date getDate() {
    return mDate;
  }
  public int getID() {
    return mJobID;
  }



}
