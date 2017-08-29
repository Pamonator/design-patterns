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
public class Main {

    public static void main(String[] args) {

        PersonFactory personFactory = PersonFactory.getFactory(new String[]{"cliente"});

        Person person = personFactory.createPerson();
        
        person.descrition();

    }

}
