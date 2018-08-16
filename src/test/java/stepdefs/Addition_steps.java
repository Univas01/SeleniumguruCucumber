package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sourcecode.ArithmeticOperation;

import static org.testng.Assert.fail;

public class Addition_steps {

    // Create arithmeticOperation object
    ArithmeticOperation arithmeticOperation;

    @Given("^I have two numbers (\\d+) and (\\d+)$")
    public void i_have_two_numbers_and(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        arithmeticOperation = new ArithmeticOperation(arg1, arg2);
        arithmeticOperation.setNum1(arg1);
        arithmeticOperation.setNum2(arg2);
    }

    @When("^I click on Add button$")
    public void i_click_on_Add_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        arithmeticOperation.setSum(Double.valueOf(arithmeticOperation.getNum1()) + Double.valueOf(arithmeticOperation.getNum2()));
    }

    @Then("^the output should be (\\d+)$")
    public void the_output_should_be(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arithmeticOperation.getSum());
        if(Double.valueOf(arithmeticOperation.getSum()).equals(Double.valueOf(arg1))){
            System.out.println("Test Passed");
        } else {
            fail("Test Failed");
        }
    }
}
