import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RentalTest {

    @Test
    void getDaysRented() {
        int daysRented = 2;

        Movie movie = new Movie("Jon Doe in New York", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, daysRented);

        assertEquals(daysRented, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        Movie movie = new Movie("Jon Doe in New York", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 0);

        assertEquals(movie, rental.getMovie());
    }
}
