package RockPaperScissors;
import java.util.Scanner;

public class mainRPS {
    public static void main(String[] args) {
        String[] matrix = new String[2];
        matrix = selectRPS();
        System.out.println(rps(matrix[0],matrix[1]));
    }
    public static String[] selectRPS(){
        String[] matrixInput = new String[2];
        boolean goodInput = false;
        for (int i=0; i<2; i++){
            do{
                Scanner sc = new Scanner(System.in);
                System.out.println("Player "+(i+1)+", select 'scissors','paper' or 'rock'.");
                matrixInput[i] = sc.next();
                if (matrixInput[i].equals("scissors") || matrixInput[i].equals("paper") ||matrixInput[i].equals("rock")){
                    goodInput = true;
                }else{
                    System.out.println("Error in selection: You must select 'scissors','paper' or 'rock'. Try again!");
                    goodInput = false;
                }
            }while (!goodInput);
        }
        return matrixInput;
    }

    public static String rps(String p1, String p2) {
        if(p1.equals(p2)) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }
}
