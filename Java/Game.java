// import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Game {

    
    static String[][] table = new String[][]{{" "," "," "},
    {" "," "," "},
    {" "," "," "}
    };


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

    public boolean Valid(char temp1, char temp2){

        char[] temp1Check = {'A', 'B', 'C', 'a', 'b', 'c'};
        char[] temp2Check = {'1', '2', '3'};
        boolean temp1Result = false;
        boolean temp2Result = false;

        for (int i = 0 ; i < temp1Check.length; i++){

            boolean thisIsValid = false;
            thisIsValid = temp1Check[i]==temp1;
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

    public void Action(){
        this.View();
        System.out.println("Please input your next move");
        Scanner nextStep = new Scanner(System.in);
        String scannerValue = nextStep.nextLine();
        char temp1 = scannerValue.charAt(0);
        char temp2 = scannerValue.charAt(1);
        if(true==this.Valid(temp1, temp2)){
            System.out.println("Good job");
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

    public static void main(String[] args) {

        Game myGame = new Game();
        myGame.Action();
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
