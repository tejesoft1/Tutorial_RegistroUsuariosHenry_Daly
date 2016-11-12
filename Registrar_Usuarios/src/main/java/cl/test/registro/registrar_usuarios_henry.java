package cl.test.registro;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



	
	public class registrar_usuarios_henry {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://10.0.159.33/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testSeleniumRegistroUsuarioHenry() throws Exception {
	    driver.get("http://henrypm.cl/app/registration/Register.jsp");
	    driver.findElement(By.name("login")).clear();
	    driver.findElement(By.name("login")).sendKeys("josefa");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("nascarteam");
	    driver.findElement(By.name("password_2")).clear();
	    driver.findElement(By.name("password_2")).sendKeys("nascarteam");
	    driver.findElement(By.name("ecom_ShipTo_Online_Email")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Online_Email")).sendKeys("josefa@gmail.com");
	    driver.findElement(By.name("ecom_ShipTo_Online_Email2")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Online_Email2")).sendKeys("josefa@gmail.com");
	    driver.findElement(By.name("clearTextHintPhrase")).clear();
	    driver.findElement(By.name("clearTextHintPhrase")).sendKeys("gato");
	    driver.findElement(By.name("clearTextHintAnswer")).clear();
	    driver.findElement(By.name("clearTextHintAnswer")).sendKeys("lii");
	    driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr/td[2]/nobr[3]/a")).click();
	    driver.findElement(By.name("enteredLicenseKey")).clear();
	    driver.findElement(By.name("enteredLicenseKey")).sendKeys("2-CTKWJ-4YCAD-MA2E3-UE786");
	    driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr/td[2]/nobr[3]/a")).click();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_First")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_First")).sendKeys("josefa");
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_Last")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Name_Last")).sendKeys("josefa");
	    driver.findElement(By.name("ecom_ShipTo_Postal_Street_Line1")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_Street_Line1")).sendKeys("plaza de armas");
	    driver.findElement(By.name("ecom_ShipTo_Postal_City")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Postal_City")).sendKeys("santiago de chile");
	    new Select(driver.findElement(By.name("ecom_ShipTo_Postal_StateProv"))).selectByVisibleText("Guam");
	    new Select(driver.findElement(By.name("ecom_ShipTo_Postal_CountryCode"))).selectByVisibleText("Chile");
	    driver.findElement(By.name("ecom_ShipTo_Telecom_Phone_Number")).clear();
	    driver.findElement(By.name("ecom_ShipTo_Telecom_Phone_Number")).sendKeys("768950905");
	    new Select(driver.findElement(By.name("languageCode"))).selectByVisibleText("Español");
	    new Select(driver.findElement(By.name("localeCode"))).selectByVisibleText("English (Canada)");
	    new Select(driver.findElement(By.name("timeZoneCode"))).selectByVisibleText("(GMT-09:00) America/Nome AKST/AKDT");
	    driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr/td[2]/nobr[3]/a")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}


