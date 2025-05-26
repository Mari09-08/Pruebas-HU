package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Prueba.EditarDesarrollador;

public class EditarDesarrolladorTest {

	public static void main(String[] args) throws InterruptedException {
		
		EditarDesarrollador home = new EditarDesarrollador();
		
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
		home.desarrollador();
		Thread.sleep(2000);
		home.editar();
		Thread.sleep(2000);
		home.editarNombre("Sebastian Velasquez");
		home.editarUsername("sebasvs0");
		home.editarEmail("sebasvs@gmail.com");
		Thread.sleep(2000);
		home.actualizar();

	}

}
