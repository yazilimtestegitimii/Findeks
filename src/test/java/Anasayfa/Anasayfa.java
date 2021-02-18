import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class Anasayfa extends BaseTest {


    @Step("TEB Anasayfasina tikla")
    public void anaSayfayaGit() throws InterruptedException {
        getUrl();
        System.out.println("Anasayfa yuklendi");
    }

    @Step("<saniye> saniye bekle")
    public void waitElement(int key) throws InterruptedException {
        Thread.sleep(key * 1000);
        System.out.println(key + " saniye beklendi");
    }

    @Step("<key> tikla")
    public void elementTiklama(String key) {
        clickElement(key);
    }

    @Step("<Krediler> hover gel bekle")
    public void elementHover(String Krediler) {
        System.out.println("Krediler de bekledi");
        hoverElement(Krediler);
    }

    @Step("<findeksRiskRaporu> elementi var mi")
    public void checkElement(String key) {
        try {
            findElement(key);
        } catch (Exception e) {
            Assert.fail("Element bulunamadi.");
        }

    }

    @Step("Yeni pencere acildi")
    public void implementation3() {
        newtab();
    }
}