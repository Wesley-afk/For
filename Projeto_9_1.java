/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_1;

/**
 *
 * @author wpass
 */
public class Projeto_9_1 {

    public static void main(String[] args) {
         int tempo = 0;
       
        for(int c = 0; c <= 600; c++){
         tempo = tempo + 1;   
         
          if(tempo < 29){
              System.out.println("O sinal está verde");
          }
          
          else if(tempo >= 31 & tempo <= 35){
              System.out.println("O sinal está amarelo");
          }
          
          else if(tempo >= 36 && tempo < 80){
              System.out.println("O sinal está vermelho");
          }          
          
          if(tempo == 80){
              tempo = 0;
          }
        }
    }
}
