package com.company;

public class Matrix {
    public static void matrix (int m , int c){
        int [][] ma = new int[m][m];
        int a1=0;
        int num=0;
        for (int j = 0; j < m; j++) {a1++;
            for (int i = 0; i < m; i++) {
                if (i>=a1){
                    ma[i][j]=num;
                } else if(i!=j){
                    ma[i][j]=ma[i][j-1]-1;
                }
                else{
                    ma[i][j] = c;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(ma[i][j] + "\t");
            }System.out.println();
        }
    }
}