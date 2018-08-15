/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Iterator;

/**
 *
 * @author a1402072
 */
public class ListaDeNomes implements Iterable<String> {

    private String[] nomes;
    private int lenght;
    

    public ListaDeNomes(String[] nomes){
        
        this.nomes = nomes;
        this.lenght = nomes.length;        
        
    }
    
    @Override
    public Iterator<String> iterator() {

        return this.new ListaDeNomesIterator();

    }

    private class ListaDeNomesIterator implements Iterator<String> {
        
        private int i = 0;
        
        @Override
        public boolean hasNext() {
           
            return this.i < ListaDeNomes.this.lenght;
            
        }

        @Override
        public String next() {
            
            return ListaDeNomes.this.nomes[++i];
            
        }

        @Override
        public void remove() {
            Iterator.super.remove(); 
        }

    }

}
