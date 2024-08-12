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
      System.out.println("Primeira interseção \n \n \n");
        int tempo = 0;
        int temporizador = 0;
        int quando_sera_gerado = 0;
        int carro_amarelo = 0;
        int carro_vermelho = 0;
        
        for(int c = 0; c <= 600; c++){
            Random sorteio = new Random();
                
                 temporizador = temporizador + 1;          
                 tempo = tempo + 1;
                 quando_sera_gerado = sorteio.nextInt(16);
                 
          if(quando_sera_gerado == temporizador){
             if(tempo < 29){ //sinal verde
                 System.out.println("O carro passou, sinal verde.");
             }
             
             else if(tempo >= 31 && tempo <= 35){ //sinal amarelo
                carro_amarelo = carro_amarelo + 1;
                   System.out.println(carro_amarelo + " Parados no sinal amarelo");
                      if(tempo < 29){
                          carro_amarelo = 0;
                           System.out.println("Os carros sairam. sinal verde");
                      }
                       if(carro_amarelo == 10){
                           while(carro_amarelo == 10){ //parei nessa parte do while. prosseguir aqui
                               System.out.println("O carro deve esperar fora da inserção. \n");
                           }
                       }
             }
             
             else if(tempo >= 36 && tempo < 80){ //sinal vermelho
                carro_vermelho = carro_vermelho + 1;
                  System.out.println(carro_vermelho + " Parados no sinal vermelho");
                    if(tempo < 29){
                        carro_vermelho = 0;
                         System.out.println("Os carros sairam. Sinal verde");
                    }
                 }
             }
          
          if(tempo < 29){ //sinal verde
              System.out.println("Sinal verde");
          }
          
          else if(tempo >= 31 & tempo <= 35){ //sinal amarelo
              System.out.println("Sinal amarelo");
              carro_amarelo = carro_amarelo + 1;
                   System.out.println(carro_amarelo + " Parados no sinal amarelo");
                      if(tempo < 29){
                          carro_amarelo = 0;
                           System.out.println("Os carros sairam. sinal verde.");
                           
                      }
          }
          
          else if(tempo >= 36 && tempo < 80){ //sinal vermelho
              System.out.println("Sinal vermelho");
              carro_vermelho = carro_vermelho + 1;
                  System.out.println(carro_vermelho + " Parados no sinal vermelho");
                    if(tempo < 29){
                        carro_vermelho = 0;
                         System.out.println("Os carros sairam. sinal verde");
                    }
          }          
          if(tempo == 80){
              tempo = 0;
          }
           if(temporizador == 15){
               temporizador = 0;
          } 
        }
        
         System.out.println(" Segunda interseção \n \n \n ");
         
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
         
         System.out.println("Terceira interseção \n \n \n");
         
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