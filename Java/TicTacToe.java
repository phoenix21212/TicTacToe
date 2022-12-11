import java.util.Scanner;

public class TicTacToe {

    String name;


        
    // public TicTacToe(String name){
    //     this.name = name;
    // }
    

    


    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);     //Creat scanner 
        
        System.out.print("Player One, please enter your name: ");
        Player playerOne = new Player(inputName.nextLine());     //Create new user based on input
        System.out.print("Player Two, please enter your name: ");
        Player playerTwo = new Player(inputName.nextLine());     //Create new user based on input
        inputName.close();      //Closing scanner

        System.out.println("Welcome "+playerOne.name+" and "+playerTwo.name);
 


    }
}