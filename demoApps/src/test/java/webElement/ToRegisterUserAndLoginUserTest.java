package webElement;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import pomRepository.LoginPage;
import pomRepository.RegisterPage;


public class ToRegisterUserAndLoginUserTest extends BaseClass {

	@Test(priority = 1)
	public void toRegisterUser() {
		
		RegisterPage register = new RegisterPage(driver);
		LoginPage login=new LoginPage(driver);

		register.registerUser("Debjyoti", "debjyoti@gmail.com", "jyoti@143");
		
		if(login.verifyRegister()) {
			System.out.println("Pass: the user has registered");
		}
		
		else
			System.out.println("Fail: the user has not registered");

		
	}
	
	@Test(priority = 2)
	public void loginUser() {
		
		LoginPage login=new LoginPage(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(login.getEmailTextField()));
		
		login.loginAction("debjyoti@gmail.com", "jyoti@143");
		
		
		if(login.verifySignIn()) {
			System.out.println("Pass: the user has signed in");
		}
		
		else
			System.out.println("Pass: the user has signed in");

		
	}

}