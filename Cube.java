package TheCubeProject;

public class Cube {

    private int[][] f = {{1,1,1}, {1,1,1}, {1,1,1}};
    private int[][] b = {{2,2,2}, {2,2,2}, {2,2,2}};
    private int[][] l = {{3,3,3}, {3,3,3}, {3,3,3}};
    private int[][] r = {{4,4,4}, {4,4,4}, {4,4,4}};
    private int[][] u = {{5,5,5}, {5,5,5}, {5,5,5}};
    private int[][] d = {{6,6,6}, {6,6,6}, {6,6,6}};
    private char[][] w = {{' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '}};

    public void printCube(){
        System.out.print("      ");
        System.out.println(u);
        System.out.print(l);
        System.out.print(f);
        System.out.print(r);
        System.out.println(b);
        System.out.print("      ");
        System.out.print(d);
    }

    public void rotatef () {}
    public void rotateb () {}
    public void rotatel () {}
    public void rotater () {}
    public void rotateu () {}
    public void rotated () {}
}
