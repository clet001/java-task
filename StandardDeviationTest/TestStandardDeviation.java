import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStandardDeviation{
    @Test
    public void testForSumOfNumbers(){
    int[] array = {1,3,2,4,5};     
    double actual = StandardDeviation.add(array);
    int expected = 6;
    assertEquals(6, expected);

}
    @Test
    public void testForSumofNumbers(){
    int[] array = {1,3,2,4,5};  
    double actual = StandardDeviation.add(array);
    int expected = 6;
    assertEquals(6, expected);




    }

    @Test
    public void testForMeanInNumbers(){
    int[] array = {1,3,2,4,5};  
    double actual = StandardDeviation.mean(array);
    int expected = 3;
    assertEquals(3, expected);



}

    @Test
    public void testForMeanDeviation(){
    int[] array = {1,3,2,4,5};  
    double actual = StandardDeviation.meanDeviation(array);
    int expected = 3;
    assertEquals(3, expected);

}
}
