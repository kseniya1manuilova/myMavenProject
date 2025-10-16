import org.testng.Assert;
import org.testng.annotations.Test;
import storage.Bag;

public class CalculateDiscountTests extends TestBase {

    @Test(groups = "positive")
    public void calculateDiscount() {
        Bag bag = new Bag("Linen", 120, 0, false, "Mom 12");
        bag.setDiscount(12.0);
        double actualPrice = bag.getFinalPrice();
        Assert.assertEquals(actualPrice, 105.6, " Wrong discount calculating ");
    }
}
