package main.java.se.fowler.refactoring.tests;

import main.java.se.fowler.refactoring.model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriceTest {

    @org.junit.jupiter.api.Test
    protected void getGetRegularCharge() {
        Price price = new RegularPrice();

        double result = 2;
        assertEquals(result, price.getCharge(1));

        double result_2 = 3.5;
        assertEquals(result_2, price.getCharge(3));

        double result_3 = 2;
        assertEquals(result_3, price.getCharge(-1));
        assertEquals(result_3, price.getCharge(0));
    }

    @org.junit.jupiter.api.Test
    protected void getChildrenCharge() {
        Price price = new ChildrensPrice();

        double result = 1.5;
        assertEquals(result, price.getCharge(1));

        double result_2 = 3;
        assertEquals(result_2, price.getCharge(4));

        double result_3 = 1.5;
        assertEquals(result_3, price.getCharge(-1));
        assertEquals(result_3, price.getCharge(0));
    }

    @org.junit.jupiter.api.Test
    protected void getNewReleasePrice() {
        Price price = new NewReleasePrice();

        double result = 3;
        assertEquals(result, price.getCharge(1));

        double result_2 = 6;
        assertEquals(result_2, price.getCharge(2));

        double result_3 = -3;
        assertEquals(result_3, price.getCharge(-1));

        double result_4 = 0;
        assertEquals(result_4, price.getCharge(0));;
    }

    @org.junit.jupiter.api.Test
    protected void testFrequentRenterPoints() {
        Price regular = new RegularPrice();
        Price children = new ChildrensPrice();
        Price newRelease = new NewReleasePrice();

        int result = 1;
        assertEquals(result, regular.getFrequentRenterPoints(1));
        assertEquals(result, regular.getFrequentRenterPoints(0));
        assertEquals(result, regular.getFrequentRenterPoints(-1));

        assertEquals(result, children.getFrequentRenterPoints(1));
        assertEquals(result, children.getFrequentRenterPoints(0));
        assertEquals(result, children.getFrequentRenterPoints(-1));

        assertEquals(result, newRelease.getFrequentRenterPoints(1));
        assertEquals(result, newRelease.getFrequentRenterPoints(0));
        assertEquals(result, newRelease.getFrequentRenterPoints(-1));

        int result_2 = 2;

        assertEquals(result_2, newRelease.getFrequentRenterPoints(2));
    }
}
