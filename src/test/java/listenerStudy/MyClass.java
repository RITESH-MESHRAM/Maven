package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerStudy.Listener.class)
public class MyClass {

	@Test
	public void a() {
		Reporter.log("a is running",true);
	}
	@Test(dependsOnMethods= {"c"})
	public void b() {
		Reporter.log("b is running",true);
	}
	@Test
	public void c() {
		Reporter.log("c is running",true);
	}
	@Test
	public void d() {
		Assert.fail();
		Reporter.log("d is running",true);
	}
}
