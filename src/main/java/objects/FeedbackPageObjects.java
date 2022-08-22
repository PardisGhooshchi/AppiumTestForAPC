package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FeedbackPageObjects {

	public FeedbackPageObjects(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nl.dtt.elizabethonfood:id/feedbackDescriptionInput")
	public WebElement feedbackDescriptionInput;

	@FindBy(id = "nl.dtt.elizabethonfood:id/feedbackSubmitButton")
	public WebElement feedbackSubmitButton;

	@FindBy(id = "android:id/message")
	public WebElement successfulMessage;

	@FindBy(xpath = "//*[@text ='OK']")
	public WebElement okButton;

}
