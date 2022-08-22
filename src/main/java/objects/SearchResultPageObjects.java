package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SearchResultPageObjects {

	public SearchResultPageObjects(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nl.dtt.elizabethonfood:id/favoriteButton")
	public WebElement favoriteButton;

	@FindBy(id = "nl.dtt.elizabethonfood:id/recommendationBookOnline")
	public WebElement bookOnlineButton;

	@FindBy(id = "nl.dtt.elizabethonfood:id/backButton")
	public WebElement backButton;

	@FindBy(id = "nl.dtt.elizabethonfood:id/recommendationTitle")
	public WebElement restaurantTitle;

	@FindBy(id = "nl.dtt.elizabethonfood:id/recommendationFeedbackPositive")
	public WebElement feedbackPositiveButton;

	@FindBy(id = "nl.dtt.elizabethonfood:id/recommendationFeedbackNegative")
	public WebElement feedbackNegativeButton;

}
