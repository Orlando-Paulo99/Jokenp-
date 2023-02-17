import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {

  public static void main(String[] args) {
  
  Scanner tec=new Scanner(System.in);
  Random gerador=new Random();
  
  System.out.println("Escolha uma das opções abaixo\n[1]-Pedra\n[2]-Papel\n[3Tesoura]");
  int jogador=tec.nextInt();
  
  switch (jogador){
    case 1:
       System.out.println("Jogador escolheu pedra");
       break;
    case 2:
       System.out.println("Jogador escolheu papel");
       break;
    case 3:
       System.out.println("Jogador escolheu tesoura");
       break;
    default:
       System.out.println("Apenas 1,2 ou 3");
       
  }
  
  
  int computador=gerador.nextInt(3);
  
  switch (computador){
    case 1:
       System.out.println("Computador escolheu pedra");
       break;
    case 2:
       System.out.println("Computador escolheu papel");
       break;
    case 3:
       System.out.println("Computador escolheu tesoura");
       break;

  }
  
  
  if(jogador==computador){
    System.out.println("Empate");
  }else{
    if((jogador==1 && computador==2) ||(jogador==2 && computador==1) || (jogador==3 && computador==2)){
      System.out.println("Jogador venceu");
    
  } else{
      System.out.println("Computador venceu");
    
  }
  
  tec.close();
  
  }
