package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import pages.InventoryPage;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class InventoryActions extends UIInteractionSteps {

    private InventoryPage inventoryPage;

    public void verifyInventoryTitle(String title) {
        String titleFound = inventoryPage.getAppLogoTitle().getText();

        assertThat(titleFound).isEqualTo(title);
    }

    public void verifyInventoryItemsSize(int numberOfItems) {
        int itemsSize = inventoryPage.getInventoryItems().size();

        assertThat(itemsSize).isEqualTo(numberOfItems);
    }
}
