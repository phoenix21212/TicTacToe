import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    String name;

    String[][] table = new String[][]{{" "," "," "},
                                      {" "," "," "},
                                      {" "," "," "}
                                     };
        
    public TicTacToe(String name){
        this.name = name;
    }
    

    


    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);  //creat scanner 
        System.out.println("Enter your name: ");
        TicTacToe myGame = new TicTacToe(inputName.nextLine()); //create object based on input

        System.out.println("Welcome "+myGame.name+",");
        // System.out.println(Arrays.toString(table));
    }
}