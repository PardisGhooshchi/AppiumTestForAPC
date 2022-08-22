package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NavigationObjects {

	public NavigationObjects(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@text=Next']")
	public WebElement nextButton;

}
