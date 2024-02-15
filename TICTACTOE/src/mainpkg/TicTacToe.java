package mainpkg;

public class TicTacToe {
    int[][] player1 = {{0,0,0},{0,0,0},{0,0,0}} ;
    int[][] player2 = {{0,0,0},{0,0,0},{0,0,0}} ;
    
    public void getPosition(int i , int j , String str) {
        if ("X".equals(str)) {
            player1[i][j] = 1;
        }
        else if ("O".equals(str)) {
            player2[i][j] = 1;
        }
    }
    public int check() {
        int r = 0 , ply1 , ply2;
        ply1 = checkPlayer(player1) ;
        ply2 = checkPlayer(player2) ;
        if (ply1 == 1) {
            r = 10 ;
        }
        else if (ply2 == 1) {
            r = 20 ;
        }
        return r ;
    }
    
    public int checkPlayer(int[][] player) {
        int[] r = new int[8] ;
        r[0] = player[0][0] + player[0][1] + player[0][2]  ;
        r[1] = player[1][0] + player[1][1] + player[1][2]  ;
        r[2] = player[2][0] + player[2][1] + player[2][2]  ;
        r[3] = player[0][0] + player[1][0] + player[2][0]  ;
        r[4] = player[0][1] + player[1][1] + player[2][1]  ;
        r[5] = player[0][2] + player[1][2] + player[2][2]  ;
        r[6] = player[0][0] + player[1][1] + player[2][2]  ;
        r[7] = player[0][2] + player[1][1] + player[2][0]  ;
        for (int ele : r) {
            System.out.print(ele);
        }
        System.out.println();
        for (int ele : r) {
            if (ele == 3) {
                return 1 ;
            }
        }
        return 0 ;
    }       
    
    public String showResult() {
        String str = "" ;
        if (check() == 10) {
            str += "Player 1 Win." ;
        }
        else if (check() == 20) {
            str += "Player 2 Win." ;
        }
        return str + " Press \"Start\" to play the Game." ;
    }
}
