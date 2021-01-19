package oyun;
import java.util.Scanner;
/**
 *
 * @author Berfin Yalınız
 */
public class Oyun {
    public static void main(String[] args) {
    Scanner entry=new Scanner(System.in);
     System.out.println("Welcome to Rock Paper Scissors Game....");
     System.out.println("Rock-1 ,Paper-2, Scissors-3");
     System.out.println("What's your selection? ");
int gamer_choice = entry.nextInt();
int pc_choice = (int)(Math.random()*3);

 if(pc_choice==gamer_choice){
     System.out.println("Computer selection: "+ pc_choice);
     System.out.println("Tied game");
 }
 else if(pc_choice==1 & gamer_choice==2){
     System.out.println("Computer selection: "+ pc_choice);
     System.out.println("Your choose: Paper, Pc choose: Rock");
     System.out.println("Congratulations !");
 }
 else if(pc_choice==1 & gamer_choice==3){
    System.out.println("Computer selection: "+ pc_choice); 
     System.out.println("Your choose: Scissors, Pc choose: Rock");
    System.out.println("Congratulations!");  
 }
  else if(pc_choice==2 & gamer_choice==3){
    System.out.println("Computer selection: "+ pc_choice); 
     System.out.println("Your choose: Paper, Pc choose: Scissors ");
    System.out.println("Congratulations!");  
 }
  else if(pc_choice==2 & gamer_choice==1){
     System.out.println("Computer selection: "+ pc_choice);
      System.out.println("Your choose: Rock, Pc choose: Paper ");
     System.out.println("You lost!");
  }
  else if(pc_choice==3 & gamer_choice==1){
     System.out.println("Computer selection: "+ pc_choice);
      System.out.println("Your choose: Rock, Pc choose: Scissors");
     System.out.println("You lost!"); 
 }
  else if(pc_choice==3 & gamer_choice==2){
    System.out.println("Computer selection: "+ pc_choice); 
     System.out.println("Your choose: Paper, Pc choose: Scissors");
    System.out.println("You lost!");
     
  }
 }   
}
