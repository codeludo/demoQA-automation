package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.PracticeFormUI.*;

@AllArgsConstructor
public class ClickCheckBoxInteraction implements Interaction {

    private final Map<String, String> data;

    public static ClickCheckBoxInteraction withItemsSelected(Map<String, String> data) {
        return instrumented(ClickCheckBoxInteraction.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (data.get("Hobbies").contains("Sports")) {
            actor.attemptsTo(Scroll.to(CB_SPORTS));
            actor.attemptsTo(Click.on(CB_SPORTS));
        }
        if(data.get("Hobbies").contains("Reading")){
            actor.attemptsTo(Scroll.to(CB_READING));
            actor.attemptsTo(Click.on(CB_READING));
        }
        if(data.get("Hobbies").contains("Music")) {
            actor.attemptsTo(Scroll.to(CB_MUSIC));
            actor.attemptsTo(Click.on(CB_MUSIC));
        }
    }
}
