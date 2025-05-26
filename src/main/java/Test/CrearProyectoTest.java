package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Prueba.CrearProyecto;

public class CrearProyectoTest {

	public static void main(String[] args) throws InterruptedException {
		CrearProyecto home = new CrearProyecto();
		
        WebDriver driver;
		
		System.setProperty("webdriver.chromedriver.driver", "\"C:\\Users\\jhont\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://192.168.1.7:3000/dashboard/admin");
		driver.manage().window().maximize();
		
		home.IniciarDriver(driver);
		Thread.sleep(2000);
		home.escribeUsuario("Administrador");
		home.escribePassword("administradores1234");
		home.ingresar();
		Thread.sleep(2000);
		home.proyectos();
		Thread.sleep(2000);
		home.crearproyecto();
		Thread.sleep(1000);
		home.nombre("NUEVO PROYECTO");
		home.descripcion("NUEVA DESCRIPCION");
		home.lider();
		home.seleccionarDesarrollador();
		Thread.sleep(2000);
		home.crear();

	}

}
