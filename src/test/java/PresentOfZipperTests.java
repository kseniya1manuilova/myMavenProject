import org.testng.Assert;
import org.testng.annotations.Test;
import storage.Bag;

public class PresentOfZipperTests extends TestBase {

    @Test(groups = "positive")
    public void bagContainZipperCheck() {
        Bag bag = new Bag("Cotton", 70, 0, true, "Cool");
        String bagContainZipperResult = bag.ContainZipper();
        Assert.assertTrue(bagContainZipperResult.contains("has a zipper"),
                "The presence of a zipper was determined incorrectly");
    }

    @Test(groups = "positive")
    public void bagNotContainZipperCheck() {
        Bag bag = new Bag("Plastic", 20, 1, false, "Shopping");
        String bagNotContainZipperResult = bag.ContainZipper();
        Assert.assertFalse(bagNotContainZipperResult.contains("hasn't a zipper"),
                "The presence of a zipper was determined incorrectly");
    }
}
