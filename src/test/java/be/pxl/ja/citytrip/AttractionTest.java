package be.pxl.ja.citytrip;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AttractionTest {
    private Attraction attraction;
    private Attraction attraction1;
    private Attraction attraction2;

    @BeforeEach
    public void beforeEach() {
        attraction = new Attraction("London Eye", 1, 3);
        attraction1 = new Attraction("Picadilly Circus", 2, 2);
        attraction2 = new Attraction("Westminster Abbey", 0.5, 2);
    }

    @Test
    public void compareToShouldReturnNegativeIntWhenThisRatingIsHigherThanORating() {
        Assertions.assertTrue(attraction.compareTo(attraction1) < 0);
    }

    @Test
    public void compareToShouldReturnPositiveIntWhenThisRatingIsLowerThanORating() {
        Assertions.assertTrue(attraction.compareTo(attraction1) < 0);
    }

    @Test
    public void compareShouldReturn0IfAttractionsHaveSameRating() {
        Assertions.assertTrue(attraction2.compareTo(attraction1) == 0);
    }
}