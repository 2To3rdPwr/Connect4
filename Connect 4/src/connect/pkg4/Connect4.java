package connect.pkg4;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Jake
 * Connect 4 is the basic connect 4 game
 * Play against a human or computer opponent.
 * Computer opponents will have savage banter.
 */
public class Connect4 
{
    public static void main(String[] args) 
    {
        Board board = new Board();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of human players: ");
        int q = in.nextInt();
        if(q==1)
        {
            //AI Game
            Joey joey = new Joey();
            Joshua joshua = new Joshua();
            ArrayList <AI> ai = new ArrayList(2);
            ai.add(0, joey);
            ai.add(1, joshua);
            System.out.println("Choose your difficulty. \n[1]Easy \n[2]Hard.");
            System.out.print("Your selection: ");
            int a = in.nextInt()-1;
            //Copied from botom. Needs modification foor 1 Player
            int c, w = 0;
            boolean game = true;
            while(game == true)
            {
                //human turn
                board.printBoard();
                System.out.println("Your turn");
                System.out.print("Input column: ");
                c=in.nextInt();
                while(board.place(1,c)==false)
                {
                    System.out.print("Try Again\nInput column: ");
                    c=in.nextInt();
                }
                w = board.win();
                if(w == 1)
                {
                    board.printBoard();
                    System.out.println("You win!");
                    game = false;
                    break;
                }
                //ai turn
                boolean d = false;
                while(d == false)
                {
                    d = board.place(-1,ai.get(a).turn(board.get()));
                }
                w = board.win();
                if(w == -1)
                {
                    board.printBoard();
                    System.out.println("You Lose!");
                    game = false;
                    break;
                }
            }
        }
        else if(q==2)
        {
            //Human Game
            int c, w = 0;
            boolean game = true;
            while(game == true)
            {
                board.printBoard();
                System.out.println("White's turn");
                System.out.print("Input column: ");
                c=in.nextInt();
                while(board.place(1,c)==false)
                {
                    System.out.print("Try Again\nInput column: ");
                    c=in.nextInt();
                }
                w = board.win();
                if(w == 1)
                {
                    board.printBoard();
                    System.out.println("White wins!");
                    game = false;
                    break;
                }
                board.printBoard();
                System.out.println("Black's turn");
                System.out.print("Input column: ");
                c=in.nextInt();
                while(board.place(-1,c)==false)
                {
                    System.out.print("Try Again\nInput column: ");
                    c=in.nextInt();
                }
                w = board.win();
                if(w == -1)
                {
                    board.printBoard();
                    System.out.println("Black wins!");
                    game = false;
                }
            }
        }
        else
            System.out.println("Sorry. Connect4 is either 1 or 2 players.");
    }
    
}
