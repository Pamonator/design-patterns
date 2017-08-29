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
public class Employee extends Person {

    @Override
    public void descrition() {
        System.out.println("Sou uma pessoa do tipo Funcionário.");
    }

}
