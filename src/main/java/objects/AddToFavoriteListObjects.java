package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddToFavoriteListObjects {

	public AddToFavoriteListObjects(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nl.dtt.elizabethonfood:id/favoriteAddListImage")
	public WebElement favoriteAddListButton;

	@FindBy(id = "nl.dtt.elizabethonfood:id/favoriteDialogCloseButton")
	public WebElement closeButton;

}
