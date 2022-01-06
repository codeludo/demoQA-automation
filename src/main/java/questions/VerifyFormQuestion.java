package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

import static ui.PracticeFormUI.*;

@AllArgsConstructor
public class VerifyFormQuestion implements Question<Boolean> {

    private final Map<String, String> data;

    public static VerifyFormQuestion inDemoqaPage(Map<String, String> data){
        return new VerifyFormQuestion(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TH_THANKS.resolveFor(actor).getText().contains(data.get("Thanks")) &&
                TD_NAME.resolveFor(actor).getText().contains(data.get("First Name")) &&
                TD_NAME.resolveFor(actor).getText().contains(data.get("Last Name")) &&
                TD_EMAIL.resolveFor(actor).getText().contains(data.get("Email")) &&
                TD_MOBILE.resolveFor(actor).getText().contains(data.get("Mobile")) &&
                TD_ADDRESS.resolveFor(actor).getText().contains(data.get("Address")) &&
                TD_GENDER.resolveFor(actor).getText().contains(data.get("Gender"));
    }
}
