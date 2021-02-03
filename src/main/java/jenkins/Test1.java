package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo1() {
		Reporter.log("Hello java",true);
	}

}
