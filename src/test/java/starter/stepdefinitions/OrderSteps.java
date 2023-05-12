package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Order;
public class OrderSteps {
    @Steps
    Order order;

    @Given("I set POST api endpoints order")
    public void setPostApiEndpointOrders() {
        order.setPostApiEndpointOrder();
    }
    @Given("I set POST api endpoints order2")
    public void setPostApiEndpointsOrder2() {
        order.setPostApiEndpointOrder2();
    }


    @Given("I set GET api endpoints order")
    public void setGetApiEndpointsOrder() {order.setGetApiEndpointOrder();}
    @Given("I set GET api endpoints order1")
    public void setGetApiEndpointsOrder1() {
        order.setGetApiEndpointOrder1();
    }
    @Given("I set GET api endpoints order2")
    public void setGetApiEndpointsOrder2() {
        order.setGetApiEndpointOrder2();
    }
    @Given("I set GET api endpoints order3")
    public void setGetApiEndpointsOrder3() {order.setGetApiEndpointOrder3();}

    @When("I send POST HTTP request order")
    public void sentPostHttpRequestsOrder() {
        order.sendPostHTTPRequestOrder();
    }
    @When("I send POST HTTP request order2")
    public void sentPostHttpRequestsOrder2() {
        order.sendPostHTTPRequestOrder2();
    }
    @When("I send GET HTTP request order")
    public void sendGetHttpRequestsOrder() {order.sendGetHttpRequestOrder();}
    @When("I send GET HTTP request order2")
    public void sendGetHttpRequestsOrder2() {
        order.sendGetHttpRequestOrder2();
    }
    @When("I send GET HTTP request order3")
    public void sendGetHttpRequestsOrder3() {
        order.sendGetHttpRequestOrder3();
    }
    @When("I send GET HTTP request order4")
    public void sendGetHttpRequestsOrder4() {
        order.sendGetHttpRequestOrder4();
    }
    @Then("I receive valid HTTP response code 200 order")
    public void receiveValidHttp200Order() {
        order.receiveValidHttp200Order();
    }
    @Then("I receive valid HTTP response code 404 order")
    public void receiveValidHttp404Order() {
        order.receiveValidHttp404Order();
    }
    @Then("I receive valid HTTP response code 401 order")
    public void receiveValidHttp401Order() {
        order.receiveValidHttp401Order();
    }
}