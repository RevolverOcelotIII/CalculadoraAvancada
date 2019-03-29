/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;


/**
 *
 * @author danpg
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opt,x,y;
        double result;
        
        JOptionPane.showMessageDialog(null, "CALCULADORA");
        
        do{
            String[] Palavras={"Soma","Subtração","Divisão","Multiplicação","Sair"};
            opt=JOptionPane.showOptionDialog(null, "O que deseja fazer?", null, 0, 0, null, Palavras, null);
            x=Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
            y=Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
            switch(opt){
                case 0:
                
                    break;
                
                case 1:
                
                    break;
                
                case 2:
                    Divisão calcDiv = new Divisão();
                    result=calcDiv.Divisao(x, y);
                    break;
            
                case 3:
                    Multiplicação calcMult = new Multiplicação();
                    result=calcMult.Multiplicacao(x, y);
                    break;
            }
        }while(opt!=4);
    }
}
