import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I enter job title {string}")
    public void iEnterJobTitleJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocationLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistanceDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more search Options link")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMinSalaryMin(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMaxSalaryMax(String salaryMax ) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryTypeSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobTypeJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on {string} button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I should see the result {string}")
    public void iShouldSeeTheResultResult(String result) {
      //  Assert.assertEquals(new ResultPage().verifyTheResults(),result, "Error" );
        Assert.assertEquals(new ResultPage().verifyTheResults(result), "Error");
    }
}
