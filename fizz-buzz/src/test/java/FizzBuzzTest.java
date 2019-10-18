import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void renameMe() {
		
		FizzBuzz fb = new FizzBuzz();
		
		for (int i=1; i<101; i++){
			
			if ((i%15)==0){
				assertEquals("FizzBuzz", fb.speak(i));
				continue;
			}
                    
                        if ((i%5)==0){
				assertEquals("Buzz", fb.speak(i));
				continue;
			}
			
			if ((i%3)==0){
				assertEquals("Fizz",fb.speak(i));
				continue;
			}
			
			assertEquals(Integer.toString(i),fb.speak(i));
		
		}
	}
        
        @Test
	public void testBasics() {
            FizzBuzz fb = new FizzBuzz();
            
            List<String> list = fb.generateList();
            
            assertEquals("1", list.get(0));
            assertEquals("2", list.get(1));
            assertEquals("4", list.get(3));
            
        }
        
        
        @Test
	public void testMultiplo3() {
            FizzBuzz fb = new FizzBuzz();
            
            List<String> list = fb.generateList();
            
            assertEquals("Fizz", list.get(2));
            assertEquals("Fizz", list.get(5));
            assertEquals("Fizz", list.get(8));
            
            
        }
        
        @Test
	public void testMultiplo5() {
            FizzBuzz fb = new FizzBuzz();
            
            List<String> list = fb.generateList();
            
            assertEquals("Buzz", list.get(4));
            assertEquals("Buzz", list.get(9));
            assertEquals("Buzz", list.get(19));
            
            
        }
        
        @Test
	public void testMultiplo15() {
            FizzBuzz fb = new FizzBuzz();
            
            List<String> list = fb.generateList();
            
            assertEquals("FizzBuzz", list.get(14));
            assertEquals("FizzBuzz", list.get(29));
            assertEquals("FizzBuzz", list.get(44));
            
            
        }
        
        @Test
	public void testTiene3() {
            FizzBuzz fb = new FizzBuzz();
            
            List<String> list = fb.generateList();
            
            assertEquals("Fizz", list.get(2));
            assertEquals("Fizz", list.get(12));
            assertEquals("Fizz", list.get(22));
            assertEquals("Fizz", list.get(30));
            
            
        }
        
        
        @Test
	public void testTiene5() {
            FizzBuzz fb = new FizzBuzz();
            
            List<String> list = fb.generateList();
            
            assertEquals("Buzz", list.get(4));
            assertEquals("Buzz", list.get(24));
            
            
        }
        
         @Test
	public void testTiene3y5() {
            FizzBuzz fb = new FizzBuzz();
            
            List<String> list = fb.generateList();
            
            assertEquals("FizzBuzz", list.get(34));
            assertEquals("FizzBuzz", list.get(52));
            //assertEquals("Buzz", list.get(134));
            
        }
        

        
        
        

}
