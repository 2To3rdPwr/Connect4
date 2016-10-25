package connect.pkg4;
/**
 * The Joey "AI" for Connect 4
 * @author Jake
 */
public class Joey implements AI
{
    private int rem = -1;//corresponds with the boards situation. 0 is normal, 1 is winning, 2 is losing, -1 is intro? more needed?
    public Joey()
    {}
    public int turn (int[][] board)
    {
        //joey's turn here
        //joey will pick cols at random unless three in a row somewhere
        //1st, test for 3-in-a-rows
        //horizontal
        boolean three = false;
        int c = 0,r=0,row = 0,col = 0;
        for(c = 0; c < 7; c++)
        {
            r = 0;
            while(board[r][c] != 0 && r<5)
            {
                    r++;
            }
            try  //try tests
            {
                if(board[r][c-1]==board[r][c-2]&&board[r][c-2]==board[r][c-3]&&board[r][c-1]!=0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c+1]==board[r][c+2]&&board[r][c+2]==board[r][c+3] && board[r][c+1]!= 0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c]==board[r-2][c]&&board[r-2][c]==board[r-3][c]&&board[r-2][c]!=0 && r<7)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                //clockwise slants from here on
                if(board[r+1][c+1]==board[r+2][c+2]&&board[r+2][c+2]==board[r+3][c+3]&&board[r+2][c+2]!=0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c+1]==board[r-2][c+2] && board[r-2][c+2] == board[r-3][c+3] && board[r-3][c+3] != 0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c-1]==board[r-2][c-2]&&board[r-2][c-2]==board[r-3][c-3]&&board[r-2][c-2]!=0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+1][c-1]==board[r+2][c-2] && board[r+2][c-2] == board[r+3][c-3] && board[r+3][c-3] != 0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            
        }
        if(three == false)
        {
                col = (int)(Math.random()*7);
        }
        return col+1;
    }
    public void remark()
    {
        //create a list of circumstantial remarks and print one out at random
        //circumstances defined by rem
        //each rem will contain multiple possible statements referenced by Math.random()
        System.out.println("[Joey]");
    }
}
