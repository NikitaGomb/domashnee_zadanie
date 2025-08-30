import java.util.Scanner;
public class homeWork1 {

    public static int calculateCustoms(int price, int weightProduct) {
        int dutyAmount = price+weightProduct*100;
        return dutyAmount;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int weightProduct = scanner.nextInt();

        int result = calculateCustoms(price, weightProduct);
        System.out.print("Размер пошлины (в руб.) составит: " + result + " руб ");
    }
}
