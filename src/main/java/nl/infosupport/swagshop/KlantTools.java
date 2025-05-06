package nl.infosupport.swagshop;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import nl.infosupport.swagshop.model.Customer;

class KlantTools {

    private static final Database database = Database.init();

    @Tool("Creates and returns a new customer")
    Customer createCustomer(@P("Customer name") String name) {
        return database.createNewCustomer(name);
    }

    @Tool("returns a customer by id")
    Customer returnCustomerById(@P("Customer id") Integer id) {
        return database.getCustomerById(id);
    }

    @Tool("returns a customer by name")
    Customer returnCustomerByName(@P("Customer name") String name) {
        return database.getCustomerByName(name);
    }

}
