package Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrearManager {
    WebDriver driver;
	
	By txt_usuario = By.xpath("/html/body/div/div/div/div/main/div/form/div[1]/input");
	By txt_password = By.xpath("//*[@id=\"password\"]");
	By btn_ingresar = By.xpath("/html/body/div/div/div/div/main/div/form/button");
	By btn_lideres = By.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li[3]/a");
	By btn_crearmanager = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div/div[1]/button");
	By txt_nombre = By.xpath("//*[@id=\"name\"]");
	By txt_email = By.xpath("//*[@id=\"email\"]");
	By txt_usuarionombre = By.xpath("//*[@id=\"username\"]");
	By txt_passworduser = By.xpath("//*[@id=\"password\"]");
	By btn_crear = By.xpath("/html/body/div/div/div/div/main/div/div/div/div/div/div[4]/div/div[2]/form/button");
	
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
	
	public void crearManager() {
		driver.findElement(btn_crearmanager).click();
	}
	
	public void escribeNombre(String nombre) {
		driver.findElement(txt_nombre).sendKeys(nombre);
	}
	
	public void escribeEmail(String email) {
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void escribeUsername(String username) {
		driver.findElement(txt_usuarionombre).sendKeys(username);
	}
	
	public void escribePasswordUser(String passworduser) {
		driver.findElement(txt_passworduser).sendKeys(passworduser);
	}
	
	public void crear() {
		driver.findElement(btn_crear).click();
	}

}
