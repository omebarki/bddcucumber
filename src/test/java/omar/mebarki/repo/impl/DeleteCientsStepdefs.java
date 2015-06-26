package omar.mebarki.repo.impl;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import omar.mebarki.model.Client;
import omar.mebarki.repo.api.Repository;
import org.junit.Assert;

/**
 * Created by Omar MEBARKI on 26/06/2015.
 */
public class DeleteCientsStepdefs {
    private Client client;
    private Repository repository;
    private long clientId;

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

    @Given("^a client with id (\\d+)$")
    public void a_client_with_id(long id) throws Throwable {
        client.setId(id);
        clientId = id;
        repository.save(client);
    }

    @When("^I delete it$")
    public void I_delete_it() throws Throwable {
        repository.delete(clientId);
    }

    @Then("^he is no longer in the repository$")
    public void he_is_no_longer_in_the_repository() throws Throwable {
        Assert.assertNull(repository.findById(clientId));
    }
}
