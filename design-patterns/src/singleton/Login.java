/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 * 
 * @author a1402072
 */

//Permite que apenas um objeto da classe seja instanciado
public class Login {
    
    public static Login loginSingleton;
    public int i = 0;
    
    private Login() {
                
    }
    
    public static Login getInstance(){
        
        if (loginSingleton == null) {
            
            loginSingleton = new Login();
            
        }
        
        return loginSingleton;
        
    }
    
    public static void main(String[] args) {
        
        Login login = Login.getInstance();
        login.i++;
        Login login2 = Login.getInstance();
        System.out.println(login2.i);
        
    }
    
}
