
import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {

	

	public String speak(int i) {
		// TODO Auto-generated method stub
		String spoken = Integer.toString(i);
		
                if ((i%15)==0){
			spoken = "FizzBuzz";
                        return spoken;
		}
                
                
		if ((i%5)==0){
			spoken = "Buzz";
                        return spoken;
		}
		
		if ((i%3)==0){
			spoken = "Fizz";
                        return spoken;
		}
		
		return spoken;
	}

        
        
        
        
        
     public List<String> generateList() {
        
        List<String> list = new ArrayList<String>();
        
        for (int i=1;i<101;i++){
            
            if ((i%15)==0){
		list.add("FizzBuzz");
                continue;
                
            } 
            
            if (Integer.toString(i).contains("3") && Integer.toString(i).contains("5")){
                list.add("FizzBuzz");
                continue;
                
            } 
   
            
            if ((i%5)==0){
		list.add("Buzz");
                continue;
                
            } 
            
            if ((i%3)==0){
		list.add("Fizz");
                continue;
                
            }   
            
          
            
            
            if (Integer.toString(i).contains("3")){
		list.add("Fizz");
                continue;
                
            } 
                        
            if (Integer.toString(i).contains("5")){
		list.add("Buzz");
                continue;
                
            } 
            list.add(Integer.toString(i));
                    
        }
        

        
        
        return list;
    
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FizzBuzz fb = new FizzBuzz();
		
		for (int i=1;i<101;i++){
			System.out.println(fb.speak(i));
		}
		

	}

}
