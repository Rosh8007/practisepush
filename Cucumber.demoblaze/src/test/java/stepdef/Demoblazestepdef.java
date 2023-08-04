package stepdef;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Demoblazestepdef {

	static WebDriver driver;

	Properties pro=new Properties();
	
	@Given("^user navigate to demoBlaze$")
	public void browser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\CJC\\driver\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");

		driver.manage().window().maximize();
		
		FileInputStream fs=new FileInputStream("src//test//resources//properties//data.Properties");
          pro.load(fs);
	}
	@And("^user click on register button$")
	public void register() 
	{
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
	}
	@And("^user enters on firstname$")
	public void firstnameM() 
	{
		driver.findElement(By.id("sign-username")).sendKeys(pro.getProperty("fn"));
	}
	@And("^user enters on lastname$")
	public void lastnmaeM() 
	{
		driver.findElement(By.xpath("id=\"sign-password\"")).sendKeys(pro.getProperty("ln"));
	}
	@And("^user clicks on regButton$")
	public void regbutton() 
	{
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"))
		.click();
	}
	@And("^user accept alert1$")
	public void alertM() 
	{
		driver.switchTo().alert().accept();
	}
	@Given("^user clicks on login button$")
	public void login() 
	{
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	}
	@And("^user enters loginname$")
	public void  loginme() 
	{
		driver.findElement(By.name("loginusername")).sendKeys(pro.getProperty("fn"));
	}
	@And("^user enters loginpassword$")
	public void  logpass() 
	{
		driver.findElement(By.name("loginpassword")).sendKeys(pro.getProperty("ln"));
	}

	@And("^user clicks on logbotton$")
	public void  logbutton() 
	{
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}
	@And("^user accept alert2$")
	public void  alert() 
	{
		driver.switchTo().alert().accept();
	}
	@Given("^user clicks on mobile to buy$")
	public void mobilebutton() 
	{
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
	}
	@And("^user clicks on addtocart$")
	public void  AddtoCart() 
	{
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}
	@And("^user accept alert3$")
	public void  alert2() 
	{
		driver.switchTo().alert();
	}
	@And("^user click on cart button$")
	public void cartButton() 
	{
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
	}
	@And("^user clicks on place order$")
	public void placeOrder() 
	{
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
	}
	@And("^user enters firstnmae$")
	public void fname() 
	{
		driver.findElement(By.id("name")).sendKeys(pro.getProperty("fn"));
	}
	@And("^user enters country$")
	public void country() 
	{
		driver.findElement(By.id("country")).sendKeys(pro.getProperty("con"));
	}
	@And("^user enters city$")
	public void city() 
	{
		driver.findElement(By.id("city")).sendKeys(pro.getProperty("cit"));
	}
	@And("^user enters creditcard$")
	public void creditcard() 
	{
		driver.findElement(By.id("card")).sendKeys(pro.getProperty("cred"));
	}
	@And("^user enters month$")
	public void month() 
	{
		driver.findElement(By.id("month")).sendKeys(pro.getProperty("mon"));
	}@And("^user enters years$")
	public void years() 
	{
		driver.findElement(By.id("year")).sendKeys(pro.getProperty("yr"));
	}
	@And("^user clicks on purchase$")
	public void purchase() 
	{
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
	}
}
