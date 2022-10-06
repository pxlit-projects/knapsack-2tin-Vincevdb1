package be.pxl.ja.citytrip;

import org.junit.jupiter.api.BeforeEach;

public class AttractionTest {
    private Attraction attraction;
    private Attraction attraction1;

    @BeforeEach
    public void BeforeEach() {
        attraction = new Attraction("London Eye", 1, 3);
        attraction1 = new Attraction("Picadilly Circus", 2, 2);
    }
}