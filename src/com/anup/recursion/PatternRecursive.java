package com.anup.recursion;
/**    pattern
        ****
        ***
        **
        *
 */
public class PatternRecursive {
    public static void main(String[] args) {
        triangleIterative(4);
        triangle(4, 0);
        triangle2(4, 0);
    }
    //iterative
    static void triangleIterative(int n){
        for (int i=n;i>=0;i--) {
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //recursive
    static void triangle(int r, int c){
        if(r == 0) {
            return;
        }
        if(c < r) {
            System.out.print("#");
            triangle(r,c+1);
        }else{
            System.out.println();
            triangle(r-1, 0);
        }

    }

    //triangle 2
    static void triangle2(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            triangle2(r,c+1);
            System.out.print("#");
        }else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }

}
