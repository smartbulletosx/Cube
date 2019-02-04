package TheCubeProject;

import java.util.Arrays;

public class Cube {

    private int[][] f = {{1,2,3}, {4,5,6}, {7,8,9}};
    private int[][] b = {{2,2,2}, {2,2,2}, {2,2,2}};
    private int[][] l = {{3,3,3}, {3,3,3}, {3,3,3}};
    private int[][] r = {{4,4,4}, {4,4,4}, {4,4,4}};
    private int[][] u = {{5,5,5}, {5,5,5}, {5,5,5}};
    private int[][] d = {{6,6,6}, {6,6,6}, {6,6,6}};
    private int buf;

    public void printCube() {
        for (int i = 0; i < 3; i++) {
            System.out.print("      ");
            for (int j = 0; j < 3; j++) {
                System.out.print(u[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(l[0][0]+ " " +l[0][1] + " " + l[0][2] + " " + f[0][0]+ " " +f[0][1] + " " + f[0][2] + " " + r[0][0]+ " " +r[0][1] + " " + r[0][2] + " " +b [0][0]+ " " +b[0][1] + " " + b[0][2]);
        System.out.println(l[1][0]+ " " +l[1][1] + " " + l[1][2] + " " + f[1][0]+ " " +f[1][1] + " " + f[1][2] + " " + r[1][0]+ " " +r[1][1] + " " + r[1][2] + " " +b [1][0]+ " " +b[1][1] + " " + b[1][2]);
        System.out.println(l[0][0]+ " " +l[2][1] + " " + l[2][2] + " " + f[2][0]+ " " +f[2][1] + " " + f[2][2] + " " + r[2][0]+ " " +r[2][1] + " " + r[2][2] + " " +b [2][0]+ " " +b[2][1] + " " + b[2][2]);
        for (int i = 0; i < 3; i++) {
            System.out.print("      ");
            for (int j = 0; j < 3; j++) {
                System.out.print(d[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void rotatef (char side) {
        if (side == '>'){
            for (int i = 0; i < 3 ; i++) {
                int c = u[2][i];
                u[2][i]=r[i][0];
                r[i][0]=c;
            }
            for (int i = 0; i < 3 ; i++) {
                int c = l[i][2];
                l[i][2]=u[2][i];
                u[2][i]=c;
            }
            for (int i = 0; i < 3 ; i++) {
                int c = d[0][i];
                d[0][i]=l[i][2];
                l[i][2]=c;
            }
            for (int i = 0; i < 3 ; i++) {
                for (int j = 0; j < 3 ; j++) {
                    buf = f[i][j];
                    f[i][j] = f[j][i];
                    f[j][i] = buf;
                }
            }
        }
        else{}
    }
    public void rotateb () {}
    public void rotatel () {}
    public void rotater () {}
    public void rotateu () {}
    public void rotated () {}
    private void swap (int a, int b){

    }
}
