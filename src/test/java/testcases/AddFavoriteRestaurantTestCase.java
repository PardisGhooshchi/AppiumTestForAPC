package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.Base;
import objects.AddToFavoriteListObjects;
import objects.CreateFavoriteListObjects;
import objects.SearchResultPageObjects;

public class AddFavoriteRestaurantTestCase extends Base {

	@Test
	public static void addFavoriteRestaurantToList() throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\framework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);

		SearchTestCase.searchValidRestaurantName();

		SearchResultPageObjects searchResultPageObjects = new SearchResultPageObjects(driver);
		searchResultPageObjects.favoriteButton.click();

		AddToFavoriteListObjects AddToFavoriteListObjects = new AddToFavoriteListObjects(driver);
		Assert.assertTrue(AddToFavoriteListObjects.closeButton.isDisplayed());
		AddToFavoriteListObjects.favoriteAddListButton.click();

		CreateFavoriteListObjects CreateFavoriteListObjects = new CreateFavoriteListObjects(driver);
		Assert.assertTrue(CreateFavoriteListObjects.favoriteDialogCloseButton.isDisplayed());
		Assert.assertTrue(CreateFavoriteListObjects.favoriteDialogSaveButton.isDisplayed());
		CreateFavoriteListObjects.favoriteDialogTitleInput
				.sendKeys((String) prop.getProperty("favoriteRestaurantListTitle"));
		CreateFavoriteListObjects.favoriteDialogSaveButton.click();

		Assert.assertTrue(CreateFavoriteListObjects.favoriteStateIcon.isDisplayed());

	}

}
