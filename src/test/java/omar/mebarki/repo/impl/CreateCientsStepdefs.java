package omar.mebarki.repo.impl;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import omar.mebarki.model.Client;
import omar.mebarki.repo.api.Repository;
import org.junit.Assert;

/**
 * Created by Omar MEBARKI on 26/06/2015.
 */
public class CreateCientsStepdefs {
    private Client client;
    private Repository repository;

    @Before
    public void setUp() {
        client = new Client();
        repository = new RepositoryImpl();
    }

    @After
    public void tearDown() {
        client = null;
        repository = null;
    }

    @Given("^a client with name \"([^\"]*)\"$")
    public void a_client_with_name(String name) throws Throwable {
        client.setName(name);
    }


    @When("^I save it in the repository$")
    public void I_save_it_in_the_repository() throws Throwable {
        repository.save(client);
    }

    @Then("^It should have been assigned an id (\\d+)$")
    public void It_should_have_been_assigned_an_id(long id) throws Throwable {
        Assert.assertEquals(id, client.getId().longValue());
    }

    @And("^saved$")
    public void saved() throws Throwable {
        Assert.assertNotNull(repository.findById(1L));
    }

}
