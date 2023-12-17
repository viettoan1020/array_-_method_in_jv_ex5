import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng :");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập giá trị thứ " + (i+1) + ": " );
            array[i] = scanner.nextInt();
        }
        int minValue = findMinValue(array);
        System.out.println("Phần tử nhỏ nhất của mảng là : " + minValue);
    }
    public static int findMinValue(int[] array) {
        if (array.length == 0) {
            System.out.println("Đây là mảng rỗng");
            return  0 ;
        }
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
