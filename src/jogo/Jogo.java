package jogo;

import java.util.Scanner;
/**
 * @author Aluno Lucas P.
 * inserir jogadores
 * inserir aposta
 * jogar dados 
 * mostrar resultado
 * mostrar vencedor
 * 
 */
public class Jogo {

    int resultado = 0;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private Jogador jogador1, jogador2;
    private Scanner entrada = new Scanner(System.in);
    
    public void inserirJogador(){
        
        System.out.println("Jogador1, Informe seu Nick Name:");
        jogador1 = new Jogador(entrada.next());
        
        System.out.println("Jogador2, Informe seu Nick Name:");
        jogador2 = new Jogador(entrada.next());
    }
    
    public void inserirAposta(){
        
        int aposta = 0;
        do{ 
            System.out.println(jogador1.getNome()+" Informe Sua Aposta");
            aposta= entrada.nextInt();
            if(aposta == jogador1.getValorAposta()){
                System.out.println("Valor ja escolhido, Tente Novamente");
            }
        }while(aposta < 2 || aposta > 12 || aposta == jogador1.getValorAposta());
        jogador2.setValorAposta(aposta);
        
        do{ 
            System.out.println(jogador2.getNome()+" Informe Sua Aposta");
            aposta= entrada.nextInt();
            if(aposta == jogador2.getValorAposta()){
                System.out.println("Valor ja escolhido, Tente Novamente");
            }
        }while(aposta < 2 || aposta > 12 || aposta == jogador1.getValorAposta());
       
    }
    
    public void jogarDado(){
    
        dado1.setValorFace();
        dado2.setValorFace();
    
    }
    
    public void mostrarResultado(){
        resultado = dado1.getValorFace() + dado2.getValorFace();
        System.out.println("Resultado: " +resultado);
    }
    
    public void mostrarVencedor(){
        if(resultado == jogador1.getValorAposta())
            System.out.println("Player 1: You Win");
            
        else if(resultado == jogador2.getValorAposta())
            System.out.println("Player 2: You Win");
        else
            System.out.println("Machine Win");
    }
         
}
