package pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class InventoryPage extends PageObject {

    @FindBy(xpath = "//div[@data-test='header-container']//div[@class='app_logo']")
    private WebElement appLogoTitle;

    @FindBy(xpath = "//div[@data-test='inventory-item']")
    private List<WebElement> inventoryItems;
}
