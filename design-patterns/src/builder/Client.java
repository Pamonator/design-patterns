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
public class Client {

    private String clientCPF;
    private String clientName;
    private String clientSurname;
    private String clientMobilePhone;
    private String clientRG;
    private char clientGender;

    private Client(Builder builder) {
        this.clientCPF = builder.clientCPF;
        this.clientName = builder.clientName;
        this.clientSurname = builder.clientSurname;
        this.clientMobilePhone = builder.clientMobilePhone;
        this.clientRG = builder.clientRG;
        this.clientGender = builder.clientGender;

    }

    public String getClientCPF() {
        return clientCPF;
    }

    public void setClientCPF(String clientCPF) {
        this.clientCPF = clientCPF;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientMobilePhone() {
        return clientMobilePhone;
    }

    public void setClientMobilePhone(String clientMobilePhone) {
        this.clientMobilePhone = clientMobilePhone;
    }

    public String getClientRG() {
        return clientRG;
    }

    public void setClientRG(String clientRG) {
        this.clientRG = clientRG;
    }

    public char getClientGender() {
        return clientGender;
    }

    public void setClientGender(char clientGender) {
        this.clientGender = clientGender;
    }

    public static class Builder {

        private String clientCPF;
        private String clientName;
        private String clientSurname;
        private String clientMobilePhone;
        private String clientRG;
        private char clientGender;

        public Builder clientCPF(String clientCPF) {
            this.clientCPF = clientCPF;
            return this;
        }

        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public Builder clientSurname(String clientSurname) {
            this.clientSurname = clientSurname;
            return this;
        }

        public Builder clientMobilePhone(String clientMobilePhone) {
            this.clientMobilePhone = clientMobilePhone;
            return this;
        }

        public Builder clientRG(String clientRG) {
            this.clientRG = clientRG;
            return this;
        }

        public Builder clientGender(char clientGender) {
            this.clientGender = clientGender;
            return this;
        }

        public Client buildIt() {
            return new Client(this);
        }

    }
}
