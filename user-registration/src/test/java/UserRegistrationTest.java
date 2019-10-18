
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class UserRegistrationTest {
    @Test
    public void xxx(){

    }

    @Test
    public void shouldBePersisted(){
        
        DatabaseManager db = Mockito.mock(DatabaseManager.class);
        IdGenerator idGenerator = Mockito.mock(IdGenerator.class);
        UserRegistration ur = new UserRegistration(db, idGenerator);
        
        Mockito.when(idGenerator.generate()).thenReturn("randomId");
        
       
        ur.persist("an@email.com", "aPassword");
        
        Usuario usuario = new Usuario("randomId", "an@email.com", "aValidPassword");
                
        //Mockito.verify(db).save(new Usuario("an@email.com", "aPassword"));
        Mockito.verify(db).save(usuario);
    }
    
    
   
   /*
    @Test
    public void shouldNotRegisterExistingUser() {
        
        DatabaseManager db = Mockito.mock(DatabaseManager.class);
        UserRegistration ur = new UserRegistration(db);
        
        
        Usuario usuario = new Usuario("an@email.com", "aPassword");
        
        when(db.get("an@email.com")).thenReturn(usuario);
       
        ur.persist("an@email.com", "aPassword");
        
        Mockito.verify(db).save(any());
    
    }
    */
  
    
    
    
}
