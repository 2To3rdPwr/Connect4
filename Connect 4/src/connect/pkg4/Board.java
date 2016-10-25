package connect.pkg4;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Jake
 */
public class Board 
{
    private int[][]board = new int[6][7];
    public Board()
    {
        //0 == blank, 1 = white, -1 = black
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 6; j++)
                board[i][j] = 0;
        }
    }
    public void setBoard(int[][] b)
    {
        board = b;
    }
    public int get(int row, int col)
    {
        return board[row][col];
    }
    public int[][] get()
    {
        return board;
    }
    public boolean place(int side, int col)
    {
        boolean fail = false;
        int row = 0;
        while(board[row][col-1]!=0)
        {
            if(row == 5)
            {
                System.out.println("Column "+col+" is full.");
                fail = true;
                break;
            }
            row++;           
        }
        if(fail == false)
        {
            board[row][col-1] = side;
            return true;
        }
        else
            return false;            
    }
    public boolean isFull(int col)
    {
        if(board[5][col]!=0)
            return false;
        else
            return true;
    }
    public int win()
    {
        int winner = 0;
        //vertical test
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(board[i][j]==board[i+1][j]&&board[i+1][j]==board[i+2][j]&&board[i+2][j]==board[i+3][j]&&board[i+3][j]!=0)
                    winner = board[i][j];
            }
        }        
        //horizontal test
        for(int i = 0; i < 6; i ++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(board[i][j]==board[i][j+1]&&board[i][j+1]==board[i][j+2]&&board[i][j+2]==board[i][j+3]&&board[i][j+3]!=0)
                    winner = board[i][j];
            }
        }
        // /Test
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(board[i][j]==board[i+1][j+1]&&board[i+1][j+1]==board[i+2][j+2]&&board[i+2][j+2]==board[i+3][j+3]&&board[i+3][j+3]!=0)
                    winner = board[i][j];
            }
        }
        // \Test
        for(int i = 3; i < 6; i ++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(board[i][j]==board[i-1][j+1]&&board[i-1][j+1]==board[i-2][j+2]&&board[i-2][j+2]==board[i-3][j+3]&&board[i-3][j+3]!=0)
                    winner = board[i][j];
            }
        }
        return winner;
    }
    public void printBoard()
    {
        System.out.println("|1|2|3|4|5|6|7|");
        System.out.println("}=+=+=+=+=+=+={");
        for(int i = 5; i >=0; i --)
        {
            for(int j = 0; j < 7; j ++)
            {
                String p;
                if(board[i][j]==1)
                    p = "0";
                else if(board[i][j]==-1)
                    p="@";
                else
                    p=" ";
                System.out.print("|"+p);
            }
            System.out.println("|");
            System.out.println("}-+-+-+-+-+-+-{");
        }
    }
}
//