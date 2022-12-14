package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

import java.util.NoSuchElementException;

public class HerokuappStepdefinitions {
    HerokuappPage herokuappPage=new HerokuappPage();

    @Then("Herokuapp Add Element butonuna basar")
    public void herokuapp_add_element_butonuna_basar() {
        herokuappPage.addButonu.click();



    }


    @Then("Herokuapp Delete butonu gorunmesini bekler")
    public void herokuapp_delete_butonu_gorunmesini_bekler() {
        //deleete butonu 15 saniyelik implicitlyWait suresi içerisinde gorudnugunden
        //buraya extra explicit wait oluşturmaya gerek yok.
        //ama gerekiyorsa...
        ReusableMethods.bekle(3);


    }



    @Then("Herokuapp Delete butonunun gorunur oldugunu test eder")
    public void herokuapp_delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());

    }


    @Then("Herokuapp Delete butonuna basarak butonu siler")
    public void herokuapp_delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButton.click();

    }


    @Then("Herokuapp Delete butonunun gorunmedigini test eder")
    public void herokuapp_delete_butonunun_gorunmedigini_test_eder() {

        boolean isDeleteButtonNotAppearing = false;
        try {
            Assert.assertFalse(herokuappPage.deleteButton.isDisplayed());
        } catch (Exception e) {
            isDeleteButtonNotAppearing=true;
        }
        /*
        ben no suc element exception ı buldugum an evet bu benim istedigim sonuc
        diyecegım ve bunun dogru olduguna karar verecegım.7
        ve flag true dedim.
        //yukaırda  Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
        da diyebilirsin
         */
        Assert.assertTrue(isDeleteButtonNotAppearing);


    }


}
