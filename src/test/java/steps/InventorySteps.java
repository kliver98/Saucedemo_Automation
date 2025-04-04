package steps;

import actions.InventoryActions;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class InventorySteps {

    @Steps
    private InventoryActions inventoryActions;

    @Then("I should see inventory page with {string} header title")
    public void verifyInventoryPageHeaderTitle(String title) {
        inventoryActions.verifyInventoryTitle(title);
    }

    @Then("I should see inventory page with {int} items")
    public void verifyInventoryPageItemsSize(int numberOfItems) {
        inventoryActions.verifyInventoryItemsSize(numberOfItems);
    }
}
