package be.pxl.ja.knapsack;
import be.pxl.ja.citytrip.Attraction;
import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnapsackTest {
    private final double MAXIMUMCAPACITY = 15;

    private Knapsack knapsack;
    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;

    private Attraction attraction1;
    @BeforeEach
    public void beforeEach() {
        knapsack = new Knapsack(MAXIMUMCAPACITY);

        product1 = new Product("product1", 10, 0);
        product2 = new Product("product2", 6, 0);
        product3 = new Product("product3", 2, 0);
        product4 = new Product("product4", 50, 0);

        attraction1 = new Attraction("attraction1" ,2, 5);
    }

    @Test
    public void KnapsackFullExceptionShouldBeThrownWhenMaximumWeightIsReached() {
        // TODO: should still be implemented
        boolean exceptionWentOff = false;
        try {
            knapsack.add(product4);
        } catch (KnapsackFullException ex) {
            System.out.println(ex.getMessage());
            exceptionWentOff = true;
        }
        Assertions.assertTrue(exceptionWentOff);
    }

    @Test
    public void getCurrentWeightShouldReturnTheSumOfTheKnapsackItemWeights() {
        double productSum = product1.getWeight() + product3.getWeight();
        try {
            knapsack.add(product1);
            knapsack.add(product3);
        } catch (KnapsackFullException ex) {
            System.out.println(ex.getMessage());
            System.out.println("KnapsackFullExceptionShouldBeThrownWhenMaximumWeightIsReached() tests should be green first");
        }
        Assertions.assertEquals(productSum, knapsack.getCurrentWeight());
    }

    @Test
    public void knapsackAddShouldBeAbleToTakeProduct() {
        try {
            knapsack.add(product1);
        } catch (KnapsackFullException ex) {
            System.out.println(ex.getMessage());
            System.out.println("KnapsackFullExceptionShouldBeThrownWhenMaximumWeightIsReached() tests should be green first");
        }

        Assertions.assertEquals(knapsack.getItems().get(0).getClass().getSimpleName(), "Product");
    }

    @Test
    public void knapsackAddShouldBeAbleToTakeAttraction() {
        try {
            knapsack.add(attraction1);
        } catch (KnapsackFullException ex) {
            System.out.println(ex.getMessage());
            System.out.println("KnapsackFullExceptionShouldBeThrownWhenMaximumWeightIsReached() tests should be green first");
        }

        Assertions.assertEquals(knapsack.getItems().get(0).getClass().getSimpleName(), "Attraction");
    }
}
