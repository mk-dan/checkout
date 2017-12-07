package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import static org.junit.Assert.*;

import implementation.Checkout;


public class CheckoutSteps {
  // set instance variable
  int bananaPrice = 0;
  int applePrice = 0;
  // set Checkout object
  Checkout checkout = new Checkout();

@Given("^the price of a \"(.*?)\" is (\\d+)c$")
  public void thePriceOfAIsC(String name, int price) throws Throwable {
    // if-else statement
      if (name.equals("banana")) {
        bananaPrice = price;
        } else {
        applePrice = price;
      }
  }
@When("^I checkout (\\d+) \"(.*?)\"$")
  public void iCheckout(int itemCount, String itemName) throws Throwable {
    // if-else statement
      if (itemName.equals("banana")) {
        checkout.add(itemCount, bananaPrice);
        } else {
        checkout.add(itemCount, applePrice);
      }
  }
@Then("^the total price should be (\\d+)c$")
  public void theTotalPriceShouldBeC(int total) throws Throwable {
    // JUnit assertion
      assertEquals(total, checkout.total());
  }
}
