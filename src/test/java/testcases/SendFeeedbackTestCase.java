package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import framework.Base;
import framework.Utilities;
import objects.FeedbackPageObjects;
import objects.SearchResultPageObjects;

public class SendFeeedbackTestCase extends Base {
	@Test
	public static void seendPositiveFeedback() throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\framework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);

		SearchTestCase.searchValidRestaurantName();

		SearchResultPageObjects searchResultPageObjects = new SearchResultPageObjects(driver);

		Utilities utils = new Utilities(driver);
		utils.scrollToText("No");

		searchResultPageObjects.feedbackPositiveButton.click();

		FeedbackPageObjects feedbackPageObjects = new FeedbackPageObjects(driver);
		feedbackPageObjects.feedbackDescriptionInput.sendKeys((String) prop.getProperty("feedbackDescription"));
		feedbackPageObjects.feedbackSubmitButton.click();

		Assert.assertEquals("Elizabeth really appreciates your feedback.",
				feedbackPageObjects.successfulMessage.getText());
		feedbackPageObjects.okButton.click();

	}

}
