import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    Board jobBoard = new Board();
          System.out.println(Board.all());

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("jobsArray", Board.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String title = request.queryParams("title");
      String industry = request.queryParams("industry");
      String description = request.queryParams("description");
      String wage = request.queryParams("wage");
      String hours = request.queryParams("hours");
      String company = request.queryParams("company");
      String location = request.queryParams("location");

      Job newJob = new Job(title, industry, description, wage, hours, company, location);
      jobBoard.addJob(newJob);


      // model.put("title", title);
      // model.put("industry", industry);
      // model.put("description", description);
      // model.put("wage", wage);
      // model.put("hours", hours);
      // model.put("company", company);
      // model.put("location", location);
      model.put("jobsArray", Board.all());
      System.out.println(Board.all());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());




  }
}
