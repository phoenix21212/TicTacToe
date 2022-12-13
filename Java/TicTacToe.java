import java.util.Scanner;

public class TicTacToe {


    public TicTacToe(){

    }

    public void Start(String playerOne, String playerTwo){
        Scanner choice = new Scanner(System.in);
        System.out.println("----------------------------\n1 - Start New Game \n2 - Read rules\n3 - Quit Game");
        Player p1 = new Player(playerOne);
        Player p2 = new Player(playerTwo);
        switch (choice.nextLine()){

            case "1":
            Game newGame = new Game(playerOne, playerTwo);
            switch(newGame.StartGame()){
                case 0:
                System.out.println("Game is draw - TTT - Start function");
                break;

                case 1:
                p1.increaseScore(1);
                break;

                case 2:
                p2.increaseScore(1);
                break;

                case 3:
                System.out.println("Something went wrong");
                break;
            }
            if (p1.score >= p2.score){
            System.out.println("\n\nThe current score is:\n\n1. - "+ p1.name+": "+p1.score+"\n2. - "+ p2.name+": "+p2.score+"\n\n");
                }
            if (p2.score >= p1.score){
                System.out.println("\n\nThe current score is:\n\n1. - "+ p2.name+": "+p2.score+"\n2. - "+ p1.name+": "+p1.score+"\n\n");
                }
            Start(playerOne, playerTwo);
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
        System.out.println("Welcome "+playerOne.name+" and "+playerTwo.name+ " the game shell begin. \nPlease select one of the following by typing it in and pressing enter.");

        currentGame.Start(playerOne.name, playerTwo.name);
    }
}