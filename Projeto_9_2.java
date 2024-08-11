/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_2;

/**
 *
 * @author wpass
 */
 import java.util.Random;

public class Projeto_9_2 {
    
    public static void main(String[] args) {
        
        int tempo = 0;
        int temporizador = 0;
        int quando_sera_gerado = 0;
        
        for(int c = 0; c <= 600; c++){
            Random sorteio = new Random();
                
                 temporizador = temporizador + 1;          
                 tempo = tempo + 1;
                 quando_sera_gerado = sorteio.nextInt(16);
                 
          if(quando_sera_gerado == temporizador){
             if(tempo < 29){
                 System.out.println("O carro passou, sinal verde.");
             }
             
             else if(tempo >= 31 && tempo <= 35){
                 System.out.println("O carro parou no sinal amarelo.");
             }
             
             else if(tempo >= 36 && tempo < 80){
                 System.out.println("O carro parou no sinal vermelho");
              }
             }
          
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
           if(temporizador == 15){
               temporizador = 0;
          } 
        }
    }
}