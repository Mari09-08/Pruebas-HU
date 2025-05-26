package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CrearProyecto {
	WebDriver driver;
	
	By txt_usuario = By.xpath("/html/body/div/div/div/div/main/div/form/div[1]/input");
	By txt_password = By.xpath("//*[@id=\"password\"]");
	By btn_ingresar = By.xpath("/html/body/div/div/div/div/main/div/form/button");
	By btn_proyectos = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[4]/a");
	By btn_crearproyecto = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div[1]/button");
	By txt_nombre = By.xpath("//*[@id=\"name\"]");
	By txt_descripcion = By.xpath("//*[@id=\"description\"]");
	By btn_lider = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div[4]/div/div[2]/form/div[4]/button");
	By btn_seleccionardesarrollador = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div[4]/div/div[2]/form/div[5]/div[2]/div/div/div/div[1]/button");
	By btn_crear = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div[4]/div/div[2]/form/button");
	
	
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
	
	public void proyectos() {
		driver.findElement(btn_proyectos).click();
	}
	
	public void crearproyecto() {
		driver.findElement(btn_crearproyecto).click();
	}
	
	public void nombre(String nombreproyecto) {
		driver.findElement(txt_nombre).sendKeys(nombreproyecto);
	}
	
	public void descripcion(String descripcionproyecto) {
		driver.findElement(txt_descripcion).sendKeys(descripcionproyecto);
	}
	
	public void lider() {
		WebElement botonLider = driver.findElement(btn_lider);

	    // Hacer clic
	    botonLider.click();

	    // Enviar tecla Enter
	    Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.ENTER).perform();
	}
	
	public void crear() {
		driver.findElement(btn_crear).click();
	}
	
	public void seleccionarDesarrollador() {
		driver.findElement(btn_seleccionardesarrollador).click();
	}
}
