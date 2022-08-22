package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CreateFavoriteListObjects {
	public CreateFavoriteListObjects(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nl.dtt.elizabethonfood:id/favoriteDialogTitleInput")
	public WebElement favoriteDialogTitleInput;

	@FindBy(id = "nl.dtt.elizabethonfood:id/favoriteDialogSaveButton")
	public WebElement favoriteDialogSaveButton;

	@FindBy(id = "nl.dtt.elizabethonfood:id/favoriteDialogCloseButton")
	public WebElement favoriteDialogCloseButton;

	@FindBy(id = "nl.dtt.elizabethonfood:id/favoriteStateIcon")
	public WebElement favoriteStateIcon;

}
