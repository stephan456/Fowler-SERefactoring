package main.java.se.fowler.refactoring.tests;

import main.java.se.fowler.refactoring.model.Customer;
import main.java.se.fowler.refactoring.model.Movie;
import main.java.se.fowler.refactoring.model.Rental;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @org.junit.jupiter.api.Test
    protected void addRental() {
        Customer customer = new Customer("Jon Doe");
        customer.addRental(new Rental(new Movie("main.java.se.fowler.refactoring.model.Movie", Movie.NEW_RELEASE), 0));

        String statement = customer.statement();

        assertEquals(5, statement.split("\n").length);
    }

    @org.junit.jupiter.api.Test
    protected void getName() {
        String customerName = "Jon Doe";
        Customer customer = new Customer(customerName);

        assertEquals(customerName, customer.getName());
    }

    @org.junit.jupiter.api.Test
    protected void statement() {
        Customer customer = new Customer("Jon Doe");
        String statement = customer.statement();

        assertEquals(4, statement.split("\n").length);
    }
}
