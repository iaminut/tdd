package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class FizzBuzzTest {
    @Test
    public void count1ShouldReturn1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.count(1));
        Assert.assertEquals("2", fizzBuzz.count(2));
        Assert.assertEquals("4", fizzBuzz.count(4));
    }

    @Test
    public void countFizzShouldReturnFizzWhenInputIs3_6_9() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.count(3));
        Assert.assertEquals("Fizz", fizzBuzz.count(6));
        Assert.assertEquals("Fizz", fizzBuzz.count(9));
    }


    @Test
    public void countBuzzShouldReturnBuzzWhenInputIs5_10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.count(5));
        Assert.assertEquals("Buzz", fizzBuzz.count(10));

    }

    @Test
    public void countFizzBuzzShouldReturnFizzBuzzWhenInputIs15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzBuzz.count(15));

    }
}
