// import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Game {

    
    static String[][] table = new String[][]{{" "," "," "},
    {" "," "," "},
    {" "," "," "}
    };

    String playerOne;
    String playerTwo;  
    int turn;
    
    public Game(String playerOne, String playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;


    }
// Prints the board with the current position.
    public void View(){
        System.out.println(System.lineSeparator().repeat(50));
        System.out.println("  A B C");
        for (int i = 0; i < table.length ; i++){
            System.out.print(i+1+"|");
        
            for (int j=0 ; j < table[i].length ; j++){
                System.out.print(table[i][j]+"|");
            }
        
            System.out.println("\n "+"-".repeat(7));
        }
    }
// Validates the user input
    public boolean Valid(char temp1, char temp2){

        char[] temp1Check = {'A', 'B', 'C'};
        char[] temp2Check = {'1', '2', '3'};
        boolean temp1Result = false;
        boolean temp2Result = false;

        for (int i = 0 ; i < temp1Check.length; i++){

            boolean thisIsValid = false;
            thisIsValid = temp1Check[i]==Character.toUpperCase(temp1);
            if (thisIsValid==true){
                temp1Result = true;
            }
        }   
        
        for (int i = 0; i < temp2Check.length; i++){
            boolean thisIsValid = false;
            thisIsValid = temp2Check[i]==temp2;
            if (thisIsValid==true){
                temp2Result = true;
            }
        }
        if(temp1Result==true && temp2Result==true){
            return true;
        } else {
            return false;
        }
        
    }
// Starts game
    public void StartGame(){
        turn = 1;
        this.Action();
    }

    public void Action(){
        this.View();
        System.out.println("Please input your next move");
        Scanner nextStep = new Scanner(System.in);
        String scannerValue = nextStep.nextLine();
        char temp1 = scannerValue.charAt(0);
        char temp2 = scannerValue.charAt(1);
        if(true==this.Valid(temp1, temp2)){
            int iTemp1= Character.toUpperCase(temp1) - 'A';
            int iTemp2= temp2 - '1';
            this.TakeAction(iTemp1, iTemp2);
            // System.out.println("Good job");


        } else {
            System.out.println("\nPlease enter a valid move\n\nIn 3 seconds");
            try {
                Thread.sleep(3000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            Action();
        }

    
    }

    public void TakeAction(int number, int letter){
        String emblem;
        if(turn%2==1){
            emblem = "X";
        } else if(turn%2==0){
            emblem = "O";
        // VS Code was not happy that the emblem variable might won't be declared, even though this should nerever result to placing the symbol "@"
        } else {
            emblem = "@";
        }
        if (table[letter][number].equals("X") || table[letter][number].equals("O")){
            System.out.println("This spot is already taken, please choose an empty spot!");
            try {
                Thread.sleep(3000);
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            this.Action();
        } else {
        table[letter][number]= emblem;
        turn++;
        this.Action();
        }
    }

    public static void main(String[] args) {

        // char a = '1';
        // int b = a - '1';
        // System.out.println(b);
        Game myGame = new Game("Test name 1","Test name 2");
        myGame.StartGame();
        // System.out.println("  A B C");
        // for (int i = 0; i < table.length ; i++){
        //     System.out.print(i+1+"|");
        
        //     for (int j=0 ; j < table[i].length ; j++){
        //         System.out.print(table[i][j]+"|");
        //     }
        
        //     System.out.println("\n "+"-".repeat(7));
        // }
        // System.out.println(Arrays.deepToString(table));
        // System.out.println(System.lineSeparator().repeat(50));
        // System.out.println(table[].length);
    }

}
