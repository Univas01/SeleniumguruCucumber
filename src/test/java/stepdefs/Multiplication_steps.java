package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sourcecode.ArithmeticOperation;

import static org.testng.Assert.fail;

public class Multiplication_steps {

    // Create arithmeticOperation object
    ArithmeticOperation arithmeticOperation;

    @Given("^two integer numbers (\\d+) and (\\d+)$")
    public void two_integer_numbers_and(int arg1, int arg2) throws Throwable {
        arithmeticOperation = new ArithmeticOperation(arg1, arg2);
        arithmeticOperation.setNum1(arg1);
        arithmeticOperation.setNum2(arg2);
    }

    @When("^I click on Multiply button$")
    public void i_click_on_Multiply_button() throws Throwable {
        arithmeticOperation.setMultiply(Double.valueOf(arithmeticOperation.getNum1()) * Double.valueOf(arithmeticOperation.getNum2()));
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int arg1) throws Throwable {
        if(Double.valueOf(arithmeticOperation.getMultiply()).equals(Double.valueOf(arg1))){
            System.out.println("Test Passed");
        } else {
            fail("Test Failed");
        }
    }
}
