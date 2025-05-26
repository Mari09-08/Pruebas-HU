package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditarProyecto {
    WebDriver driver;
	
	By txt_usuario = By.xpath("/html/body/div/div/div/div/main/div/form/div[1]/input");
	By txt_password = By.xpath("//*[@id=\"password\"]");
	By btn_ingresar = By.xpath("/html/body/div/div/div/div/main/div/form/button");
	By btn_proyectos = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[4]/a");
	By btn_editar = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div[3]/div[4]/div[3]/div/button[1]");
	By txt_editarnombre = By.xpath("//*[@id=\"name\"]");
	By txt_editardescripcion = By.xpath("//*[@id=\"description\"]");
	By btn_seleccionardesarrollador = By.xpath("//*[@id=\"dev-68340e652981b781db334c7e\"]");
	By btn_guardar = By.xpath("//*[@id=\"radix-«rb»\"]/div/div/div/form/div[3]/button");
	
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
	
	public void editarDescripcion(String descripcioneditada) {
		driver.findElement(txt_editardescripcion).clear();
		driver.findElement(txt_editardescripcion).sendKeys(descripcioneditada);
	}
	
	public void seleccionarDesarrollador() {
		driver.findElement(btn_seleccionardesarrollador).click();
	}
	
	public void guardar() {
		driver.findElement(btn_guardar).click();
	}

}
