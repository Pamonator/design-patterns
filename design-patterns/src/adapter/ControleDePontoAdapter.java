/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author a1402072
 */
public class ControleDePontoAdapter extends ControleDePonto {

    private final ControleDePontoNovo controleDePontoNovo;

    public ControleDePontoAdapter() {

        this.controleDePontoNovo = new ControleDePontoNovo();

    }    
    
    @Override
    public void registraEntrada(Funcionario funcionario) {
        
        this.controleDePontoNovo.registra(funcionario, true);
        super.registraEntrada(funcionario);
    }
    
    @Override
    public void registraSaida(Funcionario funcionario) {
        
        this.controleDePontoNovo.registra(funcionario, false);
        super.registraSaida(funcionario);
        
    }

}
