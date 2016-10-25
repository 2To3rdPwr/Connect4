/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect.pkg4;

/**
 *
 * @author Jake
 */
public class Joshua implements AI
{
    private int rem = -1;
    public Joshua()
    {}
    public int turn(int[][] board)
    {
        boolean three = false;
        int c = 0,col = 0;
        forstatement:
        for(c = 0; c < 7; c++)
        {
            int r = 0;
            while(board[5][c]!=0)
            {
                if(c==6)
                    break forstatement;
                else
                    c++;
            }
            while(board[r][c] != 0)
            {
                    r++;
            }
            try  //try tests
            {   
                if(board[r][c-1]==board[r][c-2]&&board[r][c-2]!=0&&board[r][c-3]==0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c+1]==board[r][c+2]&&board[r][c+2]!= 0&&board[r][c+3]==0)
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
                if(board[r+1][c+1]==board[r+2][c+2]&&board[r+2][c+2]!=0&&board[r+3][c+3]==0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c+1]==board[r-2][c+2] && board[r-2][c+2] != 0&&board[r-3][c+3]==0&&r<5)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c-1]==board[r-2][c-2]&&board[r-2][c-2]!=0&&board[r-3][c-3]==0&&r<5)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+1][c-1]==board[r+2][c-2] && board[r+2][c-2] != 0&&board[r+3][c+3]==0)
                {
                    col = c;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}////
            
            try  //try tests to invalidate possible boost to opponent win
            {
                if(board[r+1][c-1]==board[r+1][c-2]&&board[r+1][c-2]==board[r+1][c-3]&&board[r+1][c-1]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+1][c+1]==board[r+1][c+2]&&board[r+1][c+2]==board[r+1][c+3] && board[r+1][c+1]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                //clockwise slants from here on
                if(board[r+2][c+1]==board[r+3][c+2]&&board[r+3][c+2]==board[r+4][c+3]&&board[r+3][c+2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c+1]==board[r-1][c+2] && board[r-1][c+2] == board[r-2][c+3] && board[r-2][c+3] ==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c-1]==board[r-1][c-2]&&board[r-1][c-2]==board[r-2][c-3]&&board[r-1][c-2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+2][c-1]==board[r+3][c-2] && board[r+3][c-2] == board[r+4][c-3] && board[r+4][c-3] == 1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}            
            try  //try tests for invalidating moves that make opponent win
            {   //XCXX
                if(board[r+1][c+1]==board[r+1][c-1]&&board[r+1][c-1]==board[r+1][c-2]&&board[r+1][c-1]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            { //XXOX
                if(board[r+1][c+1]==board[r+1][c+2]&&board[r+1][c+2]==board[r+1][c-1] && board[r+1][c+1]== 1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                //clockwise slants from here on
                //X/X/O/X
                if(board[r+2][c+1]==board[r+3][c+2]&&board[r+3][c+2]==board[r][c-1]&&board[r+3][c+2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c+1]==board[r-1][c+2] && board[r-1][c+2] == board[r+2][c-1] && board[r][c+1] == 1)/////////
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c-1]==board[r-1][c-2]&&board[r-1][c-2]==board[r+2][c+1]&&board[r-1][c-2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+2][c-1]==board[r+3][c-2] && board[r+3][c-2] == board[r][c+1] && board[r+2][c-1] ==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            
            try  //try tests
            {
                if(board[r][c-1]==board[r][c-2]&&board[r][c-2]==board[r][c-3]&&board[r][c-1]!=0)
                {
                    col = c;
                    c=8;
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
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c]==board[r-2][c]&&board[r-2][c]==board[r-3][c]&&board[r-2][c]!=0 && r<5)
                {
                    col = c;
                    c=8;
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
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c+1]==board[r-2][c+2] && board[r-2][c+2] == board[r-3][c+3] && board[r-3][c+3] != 0&&r<5)
                {
                    col = c;
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c-1]==board[r-2][c-2]&&board[r-2][c-2]==board[r-3][c-3]&&board[r-2][c-2]!=0&&r<5)
                {
                    col = c;
                    c=8;
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
                    c=8;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}            
            try  //try tests
            {   //XCXX
                if(board[r][c+1]==board[r][c-1]&&board[r][c-1]==board[r][c-2]&&board[r][c-1]!=0)
                {
                    col = c;
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            { //XXOX
                if(board[r][c+1]==board[r][c+2]&&board[r][c+2]==board[r][c-1] && board[r][c+1]!= 0)
                {
                    col = c;
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                //clockwise slants from here on
                //X/X/O/X
                if(board[r+1][c+1]==board[r+2][c+2]&&board[r+2][c+2]==board[r-1][c-1]&&board[r+2][c+2]!=0)
                {
                    col = c;
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c+1]==board[r-2][c+2] && board[r-2][c+2] == board[r+1][c-1] && board[r-1][c+1] != 0)
                {
                    col = c;
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r-1][c-1]==board[r-2][c-2]&&board[r-2][c-2]==board[r+1][c+1]&&board[r-2][c-2]!=0)
                {
                    col = c;
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+1][c-1]==board[r+2][c-2] && board[r+2][c-2] == board[r-1][c+1] && board[r+1][c-1] != 0)
                {
                    col = c;
                    c=8;
                    three = true;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            
            try  //try tests
            {
                if(board[r][c-1]==board[r][c-2]&&board[r][c-2]==board[r][c-3]&&board[r][c-1]!=0)
                {
                    col = c;
                    c=8;
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
                    c=8;
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
                    c=8;
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
                    c=8;
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
                    c=8;
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
                    c=8;
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
                    c=8;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
        }
        if(three == false)
        {
            while(three == false)
            {
                c = (int)(Math.random()*7);
                three = true;
                int r = 0;
                while(board[r][c]!=0)
                {
                    r++;
                }
                try  //try tests to invalidate possible boost to opponent win
            {
                if(board[r][c-1]==board[r+1][c-2]&&board[r+1][c-2]==board[r+1][c-3]&&board[r+1][c-1]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+1][c+1]==board[r+1][c+2]&&board[r+1][c+2]==board[r+1][c+3] && board[r+1][c+1]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                //clockwise slants from here on
                if(board[r+2][c+1]==board[r+3][c+2]&&board[r+3][c+2]==board[r+4][c+3]&&board[r+3][c+2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c+1]==board[r-1][c+2] && board[r-1][c+2] == board[r-2][c+3] && board[r-2][c+3] ==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c-1]==board[r-1][c-2]&&board[r-1][c-2]==board[r-2][c-3]&&board[r-1][c-2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+2][c-1]==board[r+3][c-2] && board[r+3][c-2] == board[r+4][c-3] && board[r+4][c-3] == 1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}            
            try  //try tests for invalidating moves that make opponent win
            {   //XCXX
                if(board[r+1][c+1]==board[r+1][c-1]&&board[r+1][c-1]==board[r+1][c-2]&&board[r+1][c-1]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            { //XXOX
                if(board[r+1][c+1]==board[r+1][c+2]&&board[r+1][c+2]==board[r+1][c-1] && board[r+1][c+1]== 1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                //clockwise slants from here on
                //X/X/O/X
                if(board[r+2][c+1]==board[r+3][c+2]&&board[r+3][c+2]==board[r][c-1]&&board[r+3][c+2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c+1]==board[r-1][c+2] && board[r-1][c+2] == board[r+2][c-1] && board[r][c+1] == 1)/////////
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r][c-1]==board[r-1][c-2]&&board[r-1][c-2]==board[r+2][c+1]&&board[r-1][c-2]==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            try
            {
                if(board[r+2][c-1]==board[r+3][c-2] && board[r+3][c-2] == board[r][c+1] && board[r+2][c-1] ==1)
                {
                    three = false;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {}
            col = c;
            }
        }                
        return col+1;
    }
}
