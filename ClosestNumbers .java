import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Örnek dizi

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int inputNumber = scanner.nextInt();

        int smallerClosest = Integer.MIN_VALUE;
        int largerClosest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < inputNumber && number > smallerClosest) {
                smallerClosest = number;
            }
            if (number > inputNumber && number < largerClosest) {
                largerClosest = number;
            }
        }

        if (smallerClosest == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallerClosest);
        }

        if (largerClosest == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + largerClosest);
        }
    }
}
