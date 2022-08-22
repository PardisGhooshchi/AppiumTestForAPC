package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.SearchObjects;
import objects.SearchResultListObjects;
import objects.SearchResultPageObjects;

public class SearchTestCase extends Base {

	@Test
	public static void searchValidRestaurantName() throws IOException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities("AmsterdamApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\framework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);

		SearchObjects searchObjects = new SearchObjects(driver);
		searchObjects.searchBox.click();
		searchObjects.searchInput.sendKeys((String) prop.getProperty("restaurantName"));

		SearchResultListObjects searchResultListObjects = new SearchResultListObjects(driver);
		Assert.assertEquals("Restaurant Flore", searchResultListObjects.searchResultTitle.getText());
		searchResultListObjects.searchResultTitle.click();

		SearchResultPageObjects searchResultPageObjects = new SearchResultPageObjects(driver);
		Assert.assertTrue(searchResultPageObjects.favoriteButton.isDisplayed());
		Assert.assertTrue(searchResultPageObjects.backButton.isDisplayed());
		Assert.assertTrue(searchResultPageObjects.bookOnlineButton.isDisplayed());

	}

}
