import java.util.Scanner;

public class TicTacToe {


    public TicTacToe(){

    }

    public void Start(String playerOne, String playerTwo){
        Scanner choice = new Scanner(System.in);
        System.out.println("1 - Start New Game \n2 - Read rules\n3 - Quite Game");
        switch (choice.nextLine()){

            case "1":
            Game newGame = new Game(playerOne, playerTwo);

            
            break;

            case "2":
            System.out.println("This is going to be rules eventually");
            break;

            case "3":
            break;

            default:
            System.out.println("Incorrect statement was entered, please choose a correct statement from the list above.");
            Start(playerOne, playerTwo);
        }
    }

    public static void main(String[] args) {
        TicTacToe currentGame = new TicTacToe();

        Scanner input= new Scanner(System.in);     //Creat scanner 
        System.out.print("Player One, please enter your name: ");
        Player playerOne = new Player(input.nextLine());     //Create new user based on input
        System.out.print("Player Two, please enter your name: ");
        Player playerTwo = new Player(input.nextLine());     //Create new user based on input
        // inputName.close();      //Closing scanner


        System.out.println("Welcome "+playerOne.name+" and "+playerTwo.name+ " the game shell begin. \nPlease select one of the following by typing it in.");

        currentGame.Start(playerOne.name, playerTwo.name);
        // System.out.println("1 - Start New Game \n 2 - Read rules");
        // System.out.println(choice.nextLine());
        // if (choice.nextLine().equals("1")){
        //     System.out.println("This will start a game eventually");
        // } else if (choice.nextLine().equals("2")){
        //     System.out.println("This is going to be rules eventually");
        // } else {
        //     System.out.println("Incorrect statement was added");
        //     // Start();
        // }
    }
}