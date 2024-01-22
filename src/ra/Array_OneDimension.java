package ra;

import java.util.Scanner;

public class Array_OneDimension {
    public static void main(String[] args) {
        //1. Khai báo mảng số nguyên gồm 5 phần tử
        int[] numbers = new int[5];
        //2. Khai báo mảng chuỗi gồm 3 phần tử chứa tên sinh viên
        String[] students = new String[3];
        //3. Truy cập phần tử: arrayName[index]
        //-Khởi tạo giá trị cho các phần tử mảng students
        students[0] = "Nguyễn Văn A";
        students[1] = "Nguyễn Văn B";
        students[2] = "Nguyễn Văn C";
        //4. Nhập giá trị và in ra các giá trị của mảng numbers
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]=", i);
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Giá trị các phần tử trong mảng là:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t",numbers[i]);
        }

    }
}
