package com.company;
import java.util.Scanner;
import static com.company.Matrix.matrix;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер квадратной матрицы m=");
        int m = scan.nextInt();
        System.out.println("Задайте число для матрицы c=");
        int c = scan.nextInt();
        System.out.println("Элементы матрицы: ");
        matrix(m , c);
    }
}
