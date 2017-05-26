import controllers.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;


public class HomeControllerTest {

  // Added to see if code coverage report is generated
  @Test
  public void indexShouldReturn200StatusCode(){
    HomeController homeController = new HomeController();
    assertEquals(OK, homeController.index().status());
  }
}
