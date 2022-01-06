package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PracticeFormUI.TXT_DATE;

@AllArgsConstructor
public class EnterDateInteraction implements Interaction {

    private final Map<String, String> data;

    public static EnterDateInteraction withDate(Map<String, String> data) {
        return instrumented(EnterDateInteraction.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TXT_DATE));
        actor.attemptsTo(SendKeys.of(Keys.CONTROL+"a").into(TXT_DATE));
        actor.attemptsTo(SendKeys.of(data.get("Date of Birth")).into(TXT_DATE).thenHit(Keys.ENTER));
    }
}
