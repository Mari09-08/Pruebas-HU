package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Prueba.InicioSesion;

public class InicioTest {
     public static void main(String[] args) throws InterruptedException {
    	 
    	InicioSesion home = new InicioSesion();
		
		WebDriver driver;
		
		System.setProperty("webdriver.chromedriver.driver", "\"C:\\Users\\jhont\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://192.168.1.7:3000/");
		driver.manage().window().maximize();
		
		home.IniciarDriver(driver);
		home.iniciarSesion();
		Thread.sleep(2000);
		home.escribeUsuario("Administrador");
		home.escribePassword("administradores1234");
		home.ingresar();
		
		
	}

}
