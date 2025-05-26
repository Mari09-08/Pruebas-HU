package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditarManager {
    WebDriver driver;
	
	By txt_usuario = By.xpath("/html/body/div/div/div/div/main/div/form/div[1]/input");
	By txt_password = By.xpath("//*[@id=\"password\"]");
	By btn_ingresar = By.xpath("/html/body/div/div/div/div/main/div/form/button");
	By btn_lideres = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[3]/a");
	By btn_editar = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div/div[3]/div[4]/div[3]/div/button[1]");
	By txt_editarnombre = By.xpath("//*[@id=\"name\"]");
	By txt_editarusername = By.xpath("//*[@id=\"username\"]");
	By txt_editaremail = By.xpath("//*[@id=\"email\"]");
	By btn_actualizar = By.xpath("//*[@id=\"radix-«rb»\"]/form/div[3]/button");
	
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
	
	public void editar() {
		WebElement botonEditar = driver.findElement(btn_editar);

		// Hacer scroll hasta que el botón esté visible
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", botonEditar);

		try {
			Thread.sleep(500); // Esperar 0.5 segundos
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		botonEditar.click();
	}
	
	public void editarNombre(String nombreeditado) {
		driver.findElement(txt_editarnombre).clear();
		driver.findElement(txt_editarnombre).sendKeys(nombreeditado);
	}
	
	public void editarUsername(String usernameeditado) {
		driver.findElement(txt_editarusername).clear();
		driver.findElement(txt_editarusername).sendKeys(usernameeditado);
	}
	
	public void editarEmail(String emaileditado) {
		driver.findElement(txt_editaremail).clear();
		driver.findElement(txt_editaremail).sendKeys(emaileditado);
	}
	
	public void actualizar() {
		driver.findElement(btn_actualizar).click();
	}

}
