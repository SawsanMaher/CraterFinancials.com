package tests;


	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.AmazonHomepage;
import utils.Driver;
import utils.TestDataReader;

public class amazonDemo {
public static void main(String[]args) {
	TestCase1();
}
public static void TestCase1() {
	
		Driver.getDriver().get(TestDataReader.getProperty("amazonurl"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		AmazonHomepage azpage = new AmazonHomepage();
		azpage.departmentsSearchDD.click();
		Select select = new Select(departmentsSearchDD);
		List<WebElement> options = select.getOptions();
	        if (options.size() == 58) {
	            System.out.println("Number of departments is correct: " + options.size());
	            for (WebElement option : options) {
	                System.out.println(option.getText());
	            }
	        }else {
	            System.out.println("Number of departments is incorrect.");
	        }
	}
	
public static void TestCase2() {
	Driver.getDriver().get(TestDataReader.getProperty("amazonurl"));
	Driver.getDriver().manage().window().maximize();
	Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	AmazonHomepage azpage = new AmazonHomepage();
	String actualTitle = ((WebDriver) azpage).getTitle();
	String expectedTitle = "";
	
	
	
	
}
}