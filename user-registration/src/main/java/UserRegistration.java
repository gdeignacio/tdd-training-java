

public class UserRegistration {
    
    public DatabaseManager db;
    public IdGenerator idGenerator;
    
    UserRegistration(DatabaseManager db, IdGenerator idGenerator) {
        this.db = db;
        this.idGenerator = idGenerator;
    }
      

    public void persist(String email, String password) {
        
        String id = idGenerator.generate();
        
        Usuario usuario = new Usuario(id, email, password);
        
        this.db.save(usuario);
        
    }
}
