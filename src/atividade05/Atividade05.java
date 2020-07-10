package atividade05;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Atividade05 {

    /**
     * Desenvolver um algoritmo que efetue a soma de todos os números
     * ímpares que são múltiplos de três e que se encontram no conjunto 
     * dos números de 1 até 500.
     */
    public static void main(String[] args) {
         
        int soma, Valor, Numero, Ac;
        
        Numero = 1;
        soma = 0;
        Ac = 0;
        Valor = 0;
        
        while(Numero >= 1 && Numero <= 500){
            
                if(Numero % 3 == 0 && Numero % 2 != 0){
                    
                    Valor = Valor + Numero;
                    Ac = Valor;
                    soma = Valor + Ac; 
                    
                     
                }
                    
                    Numero++;
            
            
        }
        
        System.out.println("A soma total é igual a: "+soma);
        
        

        
    }
    
}
