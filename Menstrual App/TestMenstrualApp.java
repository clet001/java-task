import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMenstrualApp{

    @Test
public void testForUserDetails(){

MenstrualApp result = new MenstrualApp();
boolean login = MenstrualApp.result ("Clement","clemnwa@gmail.com",22);
assertTrue(login);
}
    
    @Test
public void testCalculation(){
MenstrualApp calculation = new MenstrualApp();
int nextflow = MenstrualApp.calculation();




}








}
