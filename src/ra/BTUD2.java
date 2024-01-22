package ra;

import java.util.Scanner;

public class BTUD2 {
    public static void main(String[] args) {
        /*
         * 1. Nhập vào số dòng và số cột của mảng 2 chiều (n*m). Khai báo mảng 2 chiều n dòng m cột
         * 2. In ra menu và thực hiện các chức năng theo menu
         * ********************MENU************************
         * 1. Nhập giá trị các phần tử mảng
         * 2. In ra giá trị các phần tử mảng theo ma trận
         * 3. In ra các phần tử có giá trị chẵn trong mảng
         * 4. Tính tổng các phần tử nằm trên đường biên của ma trận i==0 || i == n-1 || j ==0 || j==m-1
         * 5. Thoát
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều:");
        int m = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng 2 chiều
        int[][] numbers = new int[n][m];
        do {
            System.out.println("*****************MENU***************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử chẵn trong mảng");
            System.out.println("4. Tính tổng các phần tử nằm trên đường biên");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("numbers[%d][%d]=", i, j);
                            numbers[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử trong mảng 2 chiều:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("%d\t", numbers[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Các phần tử chẵn trong mảng là:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (numbers[i][j] % 2 == 0) {
                                System.out.printf("%d\t", numbers[i][j]);
                            }
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                                sum += numbers[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử nằm trên đường biên: "+sum);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-5");
            }
        } while (true);
    }
}
