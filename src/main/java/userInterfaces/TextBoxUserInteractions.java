package userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextBoxUserInteractions {

    public static final Target BTN_ELEMENTS = Target
            .the("Button elements")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div"));

    public static final Target  BTN_TEXTBOX = Target
            .the("Button textbox")
            .located(By.xpath("//*[@id=\"item-0\"]"));

    public static final Target TXTB_FULL_NAME = Target
            .the("text box full name")
            .located(By.xpath("//*[@id=\"userName\"]"));

    public static final Target TXTB_EMAIL = Target
            .the("text box email")
            .located(By.xpath("//*[@id=\"userEmail\"]"));

    public static final Target TXTA_CURRENT_ADDRESS = Target
            .the("text area current address")
            .located(By.xpath("//*[@id=\"currentAddress\"]"));

    public  static final Target TXTA_PERMANENT_ADDRESS = Target
            .the("text area permanent address")
            .located(By.xpath("//*[@id=\"permanentAddress\"]"));

    public static final Target BTN_SUBMIT = Target
            .the("button submit")
            .located(By.xpath("//*[@id=\"submit\"]"));

    public static final Target LBL_VERIFICATION_FULL_NAME = Target
            .the("label full name")
            .located(By.xpath("//*[@id=\"name\"]"));

    public static final Target LBL_VERIFICATION_EMAIL = Target
            .the("label email")
            .located(By.xpath("//*[@id=\"email\"]"));

    public static final Target LBL_VERIFICATION_CURRENT_ADDRESS = Target
            .the("label current address")
            .located(By.xpath("//*[@id=\"currentAddress\"]"));

    public static final Target LBL_VERIFICATION_PERMANENT_ADDRESS = Target
            .the("label permanent address")
            .located(By.xpath("//*[@id=\"permanentAddress\"]"));

}
