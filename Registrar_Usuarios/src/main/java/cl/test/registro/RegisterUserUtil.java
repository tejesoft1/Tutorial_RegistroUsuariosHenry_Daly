package cl.test.registro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserUtil {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  

	 public RegisterUserUtil(){
		 driver = new FirefoxDriver();
		    baseUrl = "https://10.0.159.33/";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	  
	public  boolean registerUser(String nomUsuario,String dirCorreo, String nombre, String apellido, String direccion, String telefono ){
		boolean result=true;
	   try {
		
		driver.get("http://henrypm.cl/app/registration/Register.jsp");
	    driver.findElement(By.name("login")).clear();
	    driver.findElement(By.name("login")).sendKeys(nomUsuario);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.name("password_2")).clear();
	    driver.findElement(By.name("password_2")).sendKeys("123456");
	    driver.findElement(By.name("ecom_ShipTo_Online_Email")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Online_Email")).sendKeys(dirCorreo);
	    driver.findElement(By.name("ecom_ShipTo_Online_Email2")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Online_Email2")).sendKeys(dirCorreo);
	    driver.findElement(By.name("clearTextHintPhrase")).clear();
	    driver.findElement(By.name("clearTextHintPhrase")).sendKeys("gato");
	    driver.findElement(By.name("clearTextHintAnswer")).clear();
	    driver.findElement(By.name("clearTextHintAnswer")).sendKeys("lii");
	    driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr/td[2]/nobr[3]/a")).click();
	    driver.findElement(By.name("enteredLicenseKey")).clear();
	    driver.findElement(By.name("enteredLicenseKey")).sendKeys("2-CTKWJ-4YCAD-MA2E3-UE786");
	    driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr/td[2]/nobr[3]/a")).click();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_First")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_First")).sendKeys(nombre);
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_Last")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_Last")).sendKeys(apellido);
	    driver.findElement(By.name("ecom_ShipTo_Postal_Street_Line1")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Street_Line1")).sendKeys(direccion);
	    driver.findElement(By.name("ecom_ShipTo_Postal_City")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_City")).sendKeys("santiago de chile");
	    new Select(driver.findElement(By.name("ecom_ShipTo_Postal_StateProv"))).selectByVisibleText("Guam");
	    new Select(driver.findElement(By.name("ecom_ShipTo_Postal_CountryCode"))).selectByVisibleText("Chile");
	    driver.findElement(By.name("ecom_ShipTo_Telecom_Phone_Number")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Telecom_Phone_Number")).sendKeys(telefono);
	    new Select(driver.findElement(By.name("languageCode"))).selectByVisibleText("Español");
	    new Select(driver.findElement(By.name("localeCode"))).selectByVisibleText("English (Canada)");
	    new Select(driver.findElement(By.name("timeZoneCode"))).selectByVisibleText("(GMT-09:00) America/Nome AKST/AKDT");
	    driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr/td[2]/nobr[3]/a")).click();
	    driver.quit();
	    
	    /*if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver)
				.executeScript("javascript:finish();");
		}*/
	    
		
	   } catch (Exception e) {
		   result = false;
		   driver.quit();
		}
		
		return result;
	}
}
