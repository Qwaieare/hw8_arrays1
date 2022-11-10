public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1 п.1");

        int[] wholeArray; // объявление массива
        wholeArray = new int[12]; // создание массива на 12 элементов
        // инициализация массива
        wholeArray[0] = 1;
        wholeArray[1] = 2;
        wholeArray[2] = 3;

        System.out.println();
        System.out.println("Задача №1 п.2");

        double[] numbers = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println();
        System.out.println("Задача №1 п.3");

        float[] keys = new float[5];
        keys[0] = 2.7F;
        keys[4] = 8.5F;

        System.out.println();
        System.out.println("Задача №2");

        for (int arr = 0; arr < wholeArray.length; arr++) {
            if (arr == wholeArray.length - 1) {
                System.out.print(wholeArray[arr] + "\n");
            } else {
                System.out.print(wholeArray[arr] + ", ");
            }
        }
            System.out.println();
         for (int num = 0; num < numbers.length; num++) {
             if (num == numbers.length - 1) {
                 System.out.print(numbers[num] + "\n ");
             } else {
                 System.out.print(wholeArray[num] + ", ");
             }
        }
            System.out.println();
        System.out.print(keys[0] + ", ");
        System.out.print(keys[1] + ", ");
        System.out.print(keys[2] + ", ");
        System.out.print(keys[3] + ", ");
        System.out.print(keys[4] + " ");

        System.out.println();
        System.out.println("Задача №3");

        for (int arr = wholeArray.length - 1; arr >= 0; arr--) {
            if (arr > 0) {
                System.out.print(wholeArray[arr] + ", ");
            } else {
                System.out.print(wholeArray[arr] + "\n");
            }
        }
        for (int num = numbers.length - 1; num >= 0; num--) {
            if (num > 0) {
                System.out.print(numbers[num] + ", ");
            } else {
                System.out.print(numbers[num] + "\n");
            }
        }
        System.out.print(keys[4] + ", ");
        System.out.print(keys[3] + ", ");
        System.out.print(keys[2] + ", ");
        System.out.print(keys[1] + ", ");
        System.out.print(keys[0] + " ");

        System.out.println();
        System.out.println("Задача №4");

        for (int arr = 0; arr < wholeArray.length; arr++) {
            if (wholeArray[arr] % 2 != 0) {
                wholeArray[arr]++;
                if (arr != 2) {
                    System.out.print(wholeArray[arr] + ", ");
                } else {
                    System.out.print(wholeArray[arr]);
                }
            }
        }
    }
}
