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
class EmployeeFactory extends PersonFactory {

    @Override
    public Person createPerson() {
        return new Employee();
    }
    
}
