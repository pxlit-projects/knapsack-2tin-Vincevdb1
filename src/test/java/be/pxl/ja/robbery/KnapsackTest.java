package be.pxl.ja.robbery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnapsackTest {
    private final double MAXIMUMCAPACITY = 15;

    private Knapsack knapsack;
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    public void beforeEach() {
        knapsack = new Knapsack(MAXIMUMCAPACITY);

        product1 = new Product("product1", 10, 0);
        product2 = new Product("product2", 6, 0);
        product2 = new Product("product3", 2, 0);
    }

    @Test
    public void KnapsackFullExceptionShouldBeThrownWhenMaximumWeightIsReached() {
        // TODO: should still be implemented
    }


    @Test
    public void getCurrentWeightShouldReturnTheSumOfTheKnapsackItemWeights() {
        double productSum = product1.getWeight() + product2.getWeight();
        try {
            knapsack.add(product1);
            knapsack.add(product3);
        } catch (KnapsackFullException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Knapsack add tests should be green first");
        }
        Assertions.assertEquals(productSum, knapsack.getCurrentWeight());
    }
}
