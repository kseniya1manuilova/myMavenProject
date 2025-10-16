import org.testng.Assert;
import org.testng.annotations.Test;
import storage.Bag;

public class CalculateFinalPriceTests extends TestBase {

    @Test(groups = "positive")
    public void calculateFinalPrice() {
        Bag bag = new Bag("Leather", 200.0, 10.0, true, "Autumn 25");
        double actualPrice = bag.getFinalPrice();
        double expectedPrice = 180.0;
        Assert.assertEquals(actualPrice, expectedPrice, " Wrong Final price calculating ");
    }

    @Test(groups = "positive")
    public void calculateFinalPriceAfterChanges() {
        Bag bag = new Bag("Wool", 670, 10, true, "Winter 1990");
        bag.setPrice(333);
        double newActualPrice = bag.getFinalPrice();
        double expectedPrice = 299.7;
        Assert.assertEquals(newActualPrice, expectedPrice, " Wrong new final price calculating ");

    }

    @Test(groups = "negative", expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Price cannot be negative")

    public void calculateNegativeFinalPrice() {
        Bag bag = new Bag("Leather", -200.0, 10.0, true, "Autumn");
    }
}
