package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import java.util.Map;

import static userInterfaces.TextBoxUserInteractions.*;

@AllArgsConstructor
public class VerifyDataInScreenQuestion implements Question<Boolean> {

    public final Map<String, String> data;


    public static VerifyDataInScreenQuestion inDemoqaTextBoxPage(Map<String, String> data) {
        return new VerifyDataInScreenQuestion(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_VERIFICATION_FULL_NAME.resolveFor(actor).isVisible()  //.getText().contains(data.get("Full Name"))
                && LBL_VERIFICATION_EMAIL.resolveFor(actor).isVisible()  // .getText().contains(data.get("Email"))
                && LBL_VERIFICATION_CURRENT_ADDRESS.resolveFor(actor).isVisible()  //.getText().contains(data.get("Current Address"))
                && LBL_VERIFICATION_PERMANENT_ADDRESS.resolveFor(actor).isVisible();  //.getText().contains(data.get("Permanent Address"));

    }
}