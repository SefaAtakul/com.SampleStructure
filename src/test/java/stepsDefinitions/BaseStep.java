package stepsDefinitions;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import utils.Pages;

public abstract class BaseStep {
    protected final Pages PAGES = new Pages();

    protected final WebDriver DRIVER = DriverManager.getDriver();

    protected SoftAssertions softAssertions = new SoftAssertions();
}
