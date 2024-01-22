package ra;

import java.util.Scanner;

public class BTUD1 {
    public static void main(String[] args) {
        //Ứng dụng:
        /*
         * 1. Khai báo mảng số nguyên gồm 10 phần tử
         * 2. In ra menu và thực hiện các chức năng theo menu
         * ************************MENU***************************
         * 1. Nhập giá trị các phần tử mảng
         * 2. In ra giá trị các phần tử trong mảng
         * 3. Tính tổng các phần tử của mảng
         * 4. In ra giá trị các phần tử chia hết cho 3 và 5
         * 5. In ra các phần tử là số nguyên tố
         * 6. Sắp xếp mảng tăng dần
         * 7. Thoát
         * */
        // Khai báo mảng 1 chiều số nguyên gồm 10 phần tử
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        //In menu
        do {
            System.out.println("**************MENU*****************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. In giá trị các phần tử mảng");
            System.out.println("3. Tính tổng các phần tử mảng");
            System.out.println("4. In giá trị các phần tử chia hết cho 3 và 5");
            System.out.println("5. In ra giá trị các phần tử là số nguyên tố");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    //Nhập giá trị các phần tử mảng
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("numbers[%d]=", i);
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    //In giá trị các phần tử trong mảng
                    System.out.println("Giá trị các phần tử trong mảng là:");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("%d\t", numbers[i]);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < numbers.length; i++) {
                        sum += numbers[i];
                    }
                    System.out.println("Tổng giá trị các phần tử: " + sum);
                    break;
                case 4:
                    System.out.println("Các phần tử chia hết cho 3 và 5 là:");
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    System.out.println("Các phần tử là số nguyên tố trong mảng:");
                    for (int i = 0; i < numbers.length; i++) {
                        //Kiểm tra numbers[i] có phải số nguyên tố ko --> in ra
                        boolean isPrime = true;//Số nguyên tố
                        if (numbers[i] >= 2) {
                            for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                                if (numbers[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        } else {
                            isPrime = false;//Không phải số nguyên tố
                        }
                        if (isPrime) {
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 6:
                    for (int i = 0; i < numbers.length - 1; i++) {
                        for (int j = i + 1; j < numbers.length; j++) {
                            if (numbers[i] > numbers[j]) {
                                int temp = numbers[i];
                                numbers[i] = numbers[j];
                                numbers[j] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp xong mảng tăng dần");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-7");
            }
        } while (true);
    }
}
