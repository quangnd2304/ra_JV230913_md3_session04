package ra;

import java.util.Scanner;

public class Array_TwoDimensions {
    public static void main(String[] args) {
        //1. Khai báo mảng 2 chiều số nguyên gồm 3 dòng và 4 cột: 12 phần tử
        int[][] numbers = new int[3][4];
        //2. Nhập giá trị các phần tử mảng 2 chiều
        Scanner scanner = new Scanner(System.in);
        //vòng lặp chạy theo chỉ số dòng
        for (int i = 0; i < 3; i++) {
            //vòng lặp chạy theo chỉ số cột
            for (int j = 0; j < 4; j++) {
                System.out.printf("numbers[%d][%d]=",i,j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //3. In ra giá trị các phần tử của mảng theo ma trận
        for (int i = 0; i < 3; i++) {
            //In 1 dòng
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t",numbers[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
