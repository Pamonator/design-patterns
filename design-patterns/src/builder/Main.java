/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        Client client = new Client.Builder()
                .clientCPF("111.111.111-11")
                .clientName("Afronzio")
                .clientSurname("Ceboso")
                .clientMobilePhone("+551299999-9999")
                .clientRG("11.111.111-1")
                .clientGender('M')
                .buildIt();

    }

}
