package stepdefinitions.forms;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.FillPracticeForm;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PracticeFormStepDefinition {


    @When("he selects the practice form in the category forms he records data")
    public void heSelectsThePracticeFormInTheCategoryFormsHeRecordsData(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(FillPracticeForm.onDemoqaPage(data));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();
    }

    @Then("he can see his Thanks message in screen with data")
    public void heCanSeeHisThanksMessageInScreenWithData(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();
    }


}
