package task;

import interactions.ClickCheckBoxInteraction;
import interactions.ClickRadioButtonInteraction;
import interactions.EnterDateInteraction;
import interactions.ToUploadFile;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.commandhandler.UploadFile;

import java.security.Key;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PracticeFormUI.*;

@AllArgsConstructor
public class FillPracticeForm implements Task {

    private final Map<String, String> data;

    public static FillPracticeForm onDemoqaPage(Map<String, String> data){
        return instrumented(FillPracticeForm.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(BTN_FORMS));
        actor.attemptsTo(Click.on(BTN_FORMS));
        actor.attemptsTo(Click.on(BTN_PRACTICE_FORM));
        actor.attemptsTo(Enter.theValue(data.get("First Name")).into(TXTB_FIRSTNAME));
        actor.attemptsTo(Enter.theValue(data.get("Last Name")).into(TXTB_LASTNAME));
        actor.attemptsTo(Enter.theValue(data.get("Email")).into(TXTB_EMAIL));
        actor.attemptsTo(ClickRadioButtonInteraction.withData(data));
        actor.attemptsTo(Enter.theValue(data.get("Mobile")).into(TXTB_MOBILE));
        actor.attemptsTo(EnterDateInteraction.withDate(data));                      //Date
        actor.attemptsTo(Click.on(TXT_SUBJECT));
        actor.attemptsTo(Enter.theValue(data.get("Subjects")).into(TXT_SUBJECT).thenHit(Keys.ENTER));
        actor.attemptsTo(ClickCheckBoxInteraction.withItemsSelected(data));         //Hobbies
        //actor.attemptsTo(Scroll.to(BTN_SUBMIT));
        actor.attemptsTo(Click.on(BTN_UPLOAD_PICTURE));
        actor.attemptsTo(ToUploadFile.withFile(data));
        actor.attemptsTo(Enter.theValue(data.get("Current Address")).into(TXTA_CURRENT_ADDRESS));
        actor.attemptsTo(Click.on(TXTB_STATE1));
        actor.attemptsTo(Enter.theValue(data.get("State")).into(TXTB_STATE).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(TXTB_CITY1));
        actor.attemptsTo(Enter.theValue(data.get("City")).into(TXTB_CITY).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(BTN_SUBMIT));
    }
}
