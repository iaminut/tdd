package fizzbuzz;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class CountTest {
    FizzBuzz c = new FizzBuzz();

    @Test
    public void getCountShouldBe1WhenInputIs1(){

        TestCase.assertEquals("1", c.count(1));

    }

    @Test
    public void getCountShouldBe2WhenInputIs2(){

        TestCase.assertEquals("2", c.count(2));

    }

    @Test
    public void getCountShouldBeFizzWhenInputIs3(){

        TestCase.assertEquals("Fizz", c.count(3));

    }

    @Test
     public void getCountShouldBeBuzzWhenInputIs5(){

        TestCase.assertEquals("Buzz", c.count(5));

    }

    @Test
    public void getCountShouldBeFizzBuzzWhenInputIs15(){

        TestCase.assertEquals("FizzBuzz", c.count(15));

    }



}
