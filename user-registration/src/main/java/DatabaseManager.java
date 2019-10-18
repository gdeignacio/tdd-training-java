/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gdeignacio
 */
interface DatabaseManager {

    public void save(Usuario usuario);
    public Usuario get(String email);
    
}
