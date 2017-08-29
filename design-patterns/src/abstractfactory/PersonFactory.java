/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Admin
 */
abstract class PersonFactory {
    
    public static PersonFactory getFactory(String[] args) {
        
        if (args[0].equalsIgnoreCase("cliente")) {
            
            return new ClientFactory();
            
        }
        
        return new EmployeeFactory();
        
    }
    
    public abstract Person createPerson();
    
}
