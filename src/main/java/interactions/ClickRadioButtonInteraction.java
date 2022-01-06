package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PracticeFormUI.*;

@AllArgsConstructor
public class ClickRadioButtonInteraction implements Interaction {

    private final Map<String, String> data;

    public static final ClickRadioButtonInteraction withData(Map<String, String> data){
        return instrumented(ClickRadioButtonInteraction.class, data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (data.get("Gender").contains("Male"))
            actor.attemptsTo(Click.on(RBTN_MALE));
        if (data.get("Gender").contains("Female"))
            actor.attemptsTo(Click.on(RBTN_FEMALE));
        if (data.get("Gender").contains("Other"))
            actor.attemptsTo(Click.on(RBTN_OTHER));
    }
}
