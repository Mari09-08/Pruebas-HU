import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioSesion {
	WebDriver driver;
	
	By btn_iniciarsesion = By.xpath("/html/body/div/div/div/div/div/div/div/main/div[2]/div/a");
	
	public void IniciarDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void iniciarSesion() {
		driver.findElement(btn_iniciarsesion).click();
	}

}
