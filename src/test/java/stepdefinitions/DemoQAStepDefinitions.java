package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.VerifyDataInScreenQuestion;
import task.FillTextBox;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DemoQAStepDefinitions {

    @Given("that {string} visit the page {string}")
    public void goToDemoqaWebPage(String actor, String url){
        setTheStage(new OnlineCast());
        theActorCalled(actor).wasAbleTo(Open.url(url));
    }

    @When("he selects the textbox in the category elements he records data")
    public void FillTheTextBoxForm(Map<String, String> data){
        theActorInTheSpotlight().attemptsTo(FillTextBox.onThePageDemoqaTextbox(data));
    }

    @Then("he can see his data in screen")
    public void VerifyDataInScreen(Map<String, String> data){
        theActorInTheSpotlight().should(GivenWhenThen
                .seeThat(VerifyDataInScreenQuestion.inDemoqaTextBoxPage(data),
                        Matchers.equalTo(Boolean.TRUE)));
    }

}
