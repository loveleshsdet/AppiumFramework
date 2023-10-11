package screenTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import screenElements.HomeElements;
import screenPage.Homepage;

public class HomeTest extends Homepage{

	Homepage page=new Homepage();
	HomeElements eleme=new HomeElements();
@Parameters({"Mobile"})	
@Test
public void homeTesting(String datatosend) throws InterruptedException {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Duration d=Duration.ofSeconds(10);
	//driver.configuratorSetWaitForSelectorTimeout(d);
	
page.home(datatosend,"1234");
	

}
	}


