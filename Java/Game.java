// import java.util.Arrays;

public class Game {

    
    static String[][] table = new String[][]{{" "," "," "},
    {" "," "," "},
    {" "," "," "}
    };

    public static void main(String[] args) {
        
        System.out.println("  A B C");
        for (int i = 0; i < table.length ; i++){
            System.out.print(i+1+"|");
        
            for (int j=0 ; j < table[i].length ; j++){
                System.out.print(table[i][j]+"|");
            }
        
            System.out.println("\n "+"-".repeat(7));
        }
        // System.out.println(Arrays.deepToString(table));
        // System.out.println(System.lineSeparator().repeat(50));
        // System.out.println(table[].length);
    }

}
