package testScripts;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	AndroidDriver driver;
	 @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	 private MobileElement NameTextField;
	 
	 
	 @AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	 private MobileElement MaleRadioButton;
	 
	 @AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	 private MobileElement FemaleRadioButton;
	 
	 @AndroidFindBy(id="android:id/text1")
	 private MobileElement CountryDropDown;
	 
	 @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	 private MobileElement LoginButton;
	 
	 
	public MobileElement getNameTextField() {
		return NameTextField;
	}


	public MobileElement getMaleRadioButton() {
		return MaleRadioButton;
	}


	public MobileElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}


	public MobileElement getCountryDropDown() {
		return CountryDropDown;
	}


	public MobileElement getLoginButton() {
		return LoginButton;
	}


	public LoginPage(AndroidDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(new AppiumFieldDecorator(driver),	 this);
	 }
	public void login(String name,int fingers,int duration) {
		NameTextField.sendKeys(name);
	
		FemaleRadioButton.click();
		LoginButton.click();
		}
}
