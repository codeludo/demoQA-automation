package task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.TextBoxUI.*;

@AllArgsConstructor
public class FillTextBox implements Task {

    private final Map<String, String> data;

    public static FillTextBox onThePageDemoqaTextbox(Map<String, String> data) {
        return instrumented(FillTextBox.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_ELEMENTS));
        actor.attemptsTo(Click.on(BTN_ELEMENTS));
        actor.attemptsTo(Click.on(BTN_TEXTBOX));
        actor.attemptsTo(Enter.theValue(data.get("Full Name")).into(TXTB_FULL_NAME));
        actor.attemptsTo(Enter.theValue(data.get("Email")).into(TXTB_EMAIL));
        actor.attemptsTo(Enter.theValue(data.get("Current Address")).into(TXTA_CURRENT_ADDRESS));
        actor.attemptsTo(Enter.theValue(data.get("Permanent Address")).into(TXTA_PERMANENT_ADDRESS));
        actor.attemptsTo(Scroll.to(BTN_SUBMIT));
        actor.attemptsTo(Click.on(BTN_SUBMIT));
    }
}
