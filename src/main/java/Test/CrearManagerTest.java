package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Prueba.CrearManager;

public class CrearManagerTest {

	public static void main(String[] args) throws InterruptedException {
		CrearManager home = new CrearManager();
		
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
		home.lideres();
		Thread.sleep(1000);
		home.crearManager();
		Thread.sleep(1000);
		home.escribeNombre("Sebastian");
		home.escribeEmail("jhont7011@gmail.com");
		home.escribeUsername("sebasvs");
		home.escribePasswordUser("sebas12345");
		Thread.sleep(2000);
		home.crear();

	}

}
