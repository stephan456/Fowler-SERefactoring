import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void addRental() {
        Customer customer = new Customer("Jon Doe");
        customer.addRental(new Rental(new Movie("Movie", Movie.NEW_RELEASE), 0));

        String statement = customer.statement();

        assertEquals(5, statement.split("\n").length);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        String customerName = "Jon Doe";
        Customer customer = new Customer(customerName);

        assertEquals(customerName, customer.getName());
    }

    @org.junit.jupiter.api.Test
    void statement() {
        Customer customer = new Customer("Jon Doe");
        String statement = customer.statement();

        assertEquals(4, statement.split("\n").length);
    }
}