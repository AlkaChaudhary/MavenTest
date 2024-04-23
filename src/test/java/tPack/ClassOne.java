package tPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {
	@AfterTest
	public void mone() {
		System.out.println("Will execute after classes in creditCard Test");
		
	}
	@Parameters({"Url"})
	@Test
	public void testOneA(String Url) {
		System.out.println("In testOneA method of ClassOne");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Parameters({"email","password"})
	@Test
	public void testOneB(String email, String pwd) {
		System.out.println("In testOneB method of ClassOne");
		System.out.println("User Name is: "+email);
		System.out.println("User Password is: "+pwd);
		
	}
	@Test
	public void testOneC() {
		System.out.println("In testOneC method of ClassOne");
	}
	@Test
	public void testOneD() {
		System.out.println("In testOneD method of ClassOne");
	}
}

