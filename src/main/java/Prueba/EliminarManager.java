package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EliminarManager {
    WebDriver driver;
	
	By txt_usuario = By.xpath("/html/body/div/div/div/div/main/div/form/div[1]/input");
	By txt_password = By.xpath("//*[@id=\"password\"]");
	By btn_ingresar = By.xpath("/html/body/div/div/div/div/main/div/form/button");
	By btn_lideres = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[3]/a");
	By btn_eliminar = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div/div[3]/div[4]/div[3]/div/button[2]");
	By btn_confirmar = By.xpath("//*[@id=\"radix-«r8»\"]/div[2]/button[2]");
	
	public void IniciarDriver(WebDriver driver) {
		this.driver = driver;
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
	
	public void lideres() {
		driver.findElement(btn_lideres).click();
	}
	
	public void eliminar() {
		WebElement botonEliminar = driver.findElement(btn_eliminar);

		// Hacer scroll hasta que el botón esté visible
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", botonEliminar);

		try {
			Thread.sleep(500); // Esperar 0.5 segundos
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		botonEliminar.click();
	}
	
	public void confirmar() {
		driver.findElement(btn_confirmar).click();
	}

}
