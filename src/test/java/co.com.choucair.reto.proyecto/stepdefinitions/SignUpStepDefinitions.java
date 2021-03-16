package co.com.choucair.reto.proyecto.stepdefinitions;

import co.com.choucair.reto.proyecto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SignUpStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Melisa has chosen to sign up$")
    public void thanMelisaHasChosenToSignUp() {
        OnStage.theActorCalled("Melisa").wasAbleTo(OpenUp.thePage());

    }


    @When("^he signs up with valid details$")
    public void heSignsUpWithValidDetails() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterPersonalData.onThePage(),
                SelectSkills.onThePage(),
                SelectCountry.onThePage(),
                SelectBirthDate.onThePage(),
                EnterPassword.onThePage(),
                SubmitRegister.onThePage()

        );

    }

    @Then("^he should the text XY$")
    public void heShouldTheTextXY() {

    }


}
