package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioSesion {
WebDriver driver;
	
	By btn_iniciarsesion = By.xpath("/html/body/div/div/div/div/div/div/div/main/div[2]/div/a");
	By txt_usuario = By.xpath("/html/body/div/div/div/div/main/div/form/div[1]/input");
	By txt_password = By.xpath("//*[@id=\"password\"]");
	By btn_ingresar = By.xpath("/html/body/div/div/div/div/main/div/form/button");
	
	
	public void IniciarDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void iniciarSesion() {
		driver.findElement(btn_iniciarsesion).click();
	}
	
	public void escribeUsuario(String usuario) {
		driver.findElement(txt_usuario).sendKeys(usuario);
	}
	
	public void escribePassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void ingresar() {
		driver.findElement(btn_ingresar).click();
	}

}
