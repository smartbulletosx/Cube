package TheCubeProject;

public class Cube {


    private int buf1, buf2, buf3;
    private int[][] f = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
    private int[][] b = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
    private int[][] l = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
    private int[][] r = {{4, 4, 4}, {4, 4, 4}, {4, 4, 4}};
    private int[][] u = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
    private int[][] d = {{6, 6, 6}, {6, 6, 6}, {6, 6, 6}};
    

    public void printCube() {
        System.out.print("      ");
        System.out.print(u[0][0] + " ");
        System.out.print(u[0][1] + " ");
        System.out.println(u[0][2] + " ");
        System.out.print("      ");
        System.out.print(u[1][0] + " ");
        System.out.print(u[1][1] + " ");
        System.out.println(u[1][2] + " ");
        System.out.print("      ");
        System.out.print(u[2][0] + " ");
        System.out.print(u[2][1] + " ");
        System.out.println(u[2][2] + " ");
        System.out.println(l[0][0] + " " + l[0][1] + " " + l[0][2] + " " + f[0][0] + " " + f[0][1] + " " + f[0][2] + " " + r[0][0] + " " + r[0][1] + " " + r[0][2] + " " + b[0][0] + " " + b[0][1] + " " + b[0][2]);
        System.out.println(l[1][0] + " " + l[1][1] + " " + l[1][2] + " " + f[1][0] + " " + f[1][1] + " " + f[1][2] + " " + r[1][0] + " " + r[1][1] + " " + r[1][2] + " " + b[1][0] + " " + b[1][1] + " " + b[1][2]);
        System.out.println(l[2][0] + " " + l[2][1] + " " + l[2][2] + " " + f[2][0] + " " + f[2][1] + " " + f[2][2] + " " + r[2][0] + " " + r[2][1] + " " + r[2][2] + " " + b[2][0] + " " + b[2][1] + " " + b[2][2]);
        System.out.print("      ");
        System.out.print(d[0][0] + " ");
        System.out.print(d[0][1] + " ");
        System.out.println(d[0][2] + " ");
        System.out.print("      ");
        System.out.print(d[1][0] + " ");
        System.out.print(d[1][1] + " ");
        System.out.println(d[1][2] + " ");
        System.out.print("      ");
        System.out.print(d[2][0] + " ");
        System.out.print(d[2][1] + " ");
        System.out.println(d[2][2] + " ");
    }

    private int c;
    private int rnd;
    public void mix(){
        for (int i = 0; i < 20 + (int) (Math.random() * 100); i++) {
            rnd = (int) Math.random()*10;
            if ((rnd==0)||(rnd>6)){
                continue;
            }
            switch (rnd){
                case 1 : rotated('>');
                case 2 : rotateu('>');
                case 3 : rotateb('>');
                case 4 : rotatef('>');
                case 5 : rotatel('>');
                case 6 : rotater('>');
            }
        }
    }
    public void rotatef(char side) {
        if (side == '>') {
            for (int i = 0; i < 3; i++) {
                c = u[2][i];
                u[2][i] = r[i][0];
                r[i][0] = c;
            }
            for (int i = 0; i < 3; i++) {
                c = l[i][2];
                l[i][2] = u[2][i];
                u[2][i] = c;
            }
            for (int i = 0; i < 3; i++) {
                c = l[i][2];
                l[i][2] = d[0][i];
                d[0][i] = c;
            }
            f = getRotateArr(f);}
        else{
                for (int i = 0; i < 3; i++) {
                    c = u[2][i];
                    u[2][i] = l[i][2];
                    l[i][2] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = r[i][0];
                    r[i][0] = u[2][i];
                    u[2][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = r[i][0];
                    r[i][0] = d[0][i];
                    d[0][i] = c;
                }
                f=getRotateArr(f);
                f=getRotateArr(f);
                f=getRotateArr(f);
            }
        }

        public void rotateb (char side) {
            if (side == '>') {
                for (int i = 0; i < 3; i++) {
                    c = u[0][i];
                    u[0][i] = l[i][0];
                    l[i][0] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = r[i][2];
                    r[i][2] = u[0][i];
                    u[0][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = r[i][2];
                    r[i][2] = d[2][i];
                    d[2][i] = c;
                }
                b = getRotateArr(b);}
            else{
                for (int i = 0; i < 3; i++) {
                    c = u[0][i];
                    u[0][i] = r[i][2];
                    r[i][2] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = l[i][0];
                    l[i][0] = u[0][i];
                    u[0][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = l[i][0];
                    l[i][0] = d[2][i];
                    d[2][i] = c;
                }
                b=getRotateArr(b);
                b=getRotateArr(b);
                b=getRotateArr(b);
            }
        }
        public void rotatel (char side) {
            if (side == '>') {
                for (int i = 0; i < 3; i++) {
                    c = u[i][0];
                    u[i][0] = f[i][0];
                    f[i][0] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = u[i][0];
                    u[i][0] = b[i][2];
                    b[i][2] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = b[i][2];
                    b[i][2] = d[i][0];
                    d[i][0] = c;
                }
                l = getRotateArr(l);}
            else{
                for (int i = 0; i < 3; i++) {
                    c = u[i][0];
                    u[i][0] = b[i][2];
                    b[i][2] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = u[i][0];
                    u[i][0] = f[i][0];
                    f[i][0] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = f[i][0];
                    f[i][0] = d[i][0];
                    d[i][0] = c;
                }
                l=getRotateArr(l);
                l=getRotateArr(l);
                l=getRotateArr(l);
            }
        }
        public void rotater (char side) {
            if (side == '>') {
                for (int i = 0; i < 3; i++) {
                    c = u[i][2];
                    u[i][2] = b[i][0];
                    b[i][0] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = u[i][2];
                    u[i][2] = f[i][2];
                    f[i][2] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = f[i][2];
                    f[i][2] = d[i][2];
                    d[i][2] = c;
                }
                r = getRotateArr(r);}
            else{
                for (int i = 0; i < 3; i++) {
                    c = u[i][2];
                    u[i][2] = f[i][2];
                    f[i][2] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = u[i][2];
                    u[i][2] = b[i][0];
                    b[i][0] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = b[i][0];
                    b[i][0] = d[i][2];
                    d[i][2] = c;
                }
                r=getRotateArr(r);
                r=getRotateArr(r);
                r=getRotateArr(r);
            }
        }
        public void rotateu (char side) {
            if (side == '>') {
                for (int i = 0; i < 3; i++) {
                    c = b[0][i];
                    b[0][i] = r[0][i];
                    r[0][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = b[0][i];
                    b[0][i] = l[0][i];
                    l[0][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = l[0][i];
                    l[0][i] = f[0][i];
                    f[0][i] = c;
                }
                u = getRotateArr(u);
            }
            else{
                for (int i = 0; i < 3; i++) {
                    c = b[0][i];
                    b[0][i] = l[0][i];
                    l[0][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = b[0][i];
                    b[0][i] = r[0][i];
                    r[0][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = r[0][i];
                    r[0][i] = f[0][i];
                    f[0][i] = c;
                }
                u=getRotateArr(u);
                u=getRotateArr(u);
                u=getRotateArr(u);
            }
        }
        public void rotated (char side) {
            if (side == '>') {
                for (int i = 0; i < 3; i++) {
                    c = f[2][i];
                    f[2][i] = r[2][i];
                    r[2][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = f[2][i];
                    f[2][i] = l[2][i];
                    l[2][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = l[2][i];
                    l[2][i] = b[2][i];
                    b[2][i] = c;
                }
                d = getRotateArr(d);}
            else{
                for (int i = 0; i < 3; i++) {
                    c = f[2][i];
                    f[2][i] = l[2][i];
                    l[2][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = f[2][i];
                    f[2][i] = r[2][i];
                    r[2][i] = c;
                }
                for (int i = 0; i < 3; i++) {
                    c = r[2][i];
                    r[2][i] = b[2][i];
                    b[2][i] = c;
                }
                d=getRotateArr(d);
                d=getRotateArr(d);
                d=getRotateArr(d);
            }
        }

    private int[][] getRotateArr ( int[][] sourceArr){
        int[][] retArr = new int[sourceArr[0].length][sourceArr.length];
        int retArrI = 0;
        int retArrJ = sourceArr.length - 1;
        for (int[] srI : sourceArr) {
            for (int srJ : srI)
                retArr[retArrI++][retArrJ] = srJ;
            retArrI = 0;
            retArrJ--;
        }
        return retArr;}

        }


