package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormUI{

    public static final Target BTN_FORMS = Target
            .the("forms buttons")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));

    public static final Target BTN_PRACTICE_FORM = Target
            .the("practice-form button")
            .located(By.xpath("//*[text()=\"Practice Form\"]"));

    public static final Target TXTB_FIRSTNAME = Target
            .the("first name textbox")
            .located(By.id("firstName"));

    public static final Target TXTB_LASTNAME = Target
            .the("last name textbox")
            .located(By.id("lastName"));

    public static final Target TXTB_EMAIL = Target
            .the("email textbox")
            .located(By.id("userEmail"));

    public static final Target RBTN_MALE = Target
            .the("Male radio button")
            .located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));

    public static final Target RBTN_FEMALE = Target
            .the("Female radio button")
            .located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));

    public static final Target RBTN_OTHER = Target
            .the("Other radio button")
            .located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label"));

    public static final Target TXTB_MOBILE = Target
            .the("user number textbox")
            .located(By.id("userNumber"));

    public static final Target TXT_DATE = Target
            .the("date of birth textbox")
            .located(By.id("dateOfBirthInput"));

    public static final Target TXT_SUBJECT = Target
            .the("subject container textbox")
            .located(By.id("subjectsInput"));

    public static final Target CB_SPORTS = Target
            .the("Hobbies checkbox sports")
            .located(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));

    public static final Target CB_READING = Target
            .the("Hobbies checkbox reading")
            .located(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));

    public static final Target CB_MUSIC = Target
            .the("Hobbies checkbox music")
            .located(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));

    public static final Target BTN_UPLOAD_PICTURE = Target
            .the("upload file button")
            .locatedBy("//*[text()='Select picture']");

    public static final Target TXTA_CURRENT_ADDRESS = Target
            .the("current address text area")
            .located(By.id("currentAddress"));

    public static final Target TXTB_STATE = Target
            .the("state selection text box")
            .located(By.id("react-select-3-input"));

    public static final Target TXTB_STATE1 = Target
            .the("state selection text box")
            .located(By.xpath("//*[@id=\"state\"]/div/div[1]"));

    public static final Target TXTB_CITY = Target
            .the("city selection text box")
            .located(By.id("react-select-4-input"));

    public static final Target TXTB_CITY1 = Target
            .the("city selection text box")
            .located(By.xpath("//*[@id=\"city\"]/div/div[1]"));

    public static final Target BTN_SUBMIT = Target
            .the("submit button")
            .located(By.id("submit"));

    public static final Target TH_THANKS = Target
            .the("label thanks message")
            .located(By.id("example-modal-sizes-title-lg"));

    // TD = table data
    public static final Target TD_NAME = Target
            .the("verification full name table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr/td[2]"));

    public static final Target TD_EMAIL = Target
            .the("verification email table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[2]/td[2]"));

    public static final Target TD_GENDER = Target
            .the("verification gender table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[3]/td[2]"));

    public static final Target TD_MOBILE = Target
            .the("verification mobile table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[4]/td[2]"));

    public static final Target TD_DATE_BIRTH = Target
            .the("verification date of birth table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[5]/td[2]"));

    public static final Target TD_SUBJECT = Target
            .the("verification subjects table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[6]/td[2]"));

    public static final Target TD_HOBBIES = Target
            .the("verification hobbies table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[7]/td[2]"));


    public static final Target TD_PICTURE_UPLOADED = Target
            .the("verification picture upladed table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[8]/td[2]"));

    public static final Target TD_ADDRESS = Target
            .the("verification address table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[9]/td[2]"));

    public static final Target TD_STATE_CITY = Target
            .the("verification state and city table data ")
            .located(By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[10]/td[2]"));

}
