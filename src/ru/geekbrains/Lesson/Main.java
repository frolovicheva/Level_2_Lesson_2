package ru.geekbrains.Lesson;

public class Main {

    public static void main(String[] args) {

        char[][] array = {{'X', 'Y','Z','O'}, {'A','S','D','F'}, {'Q','W','E','R'}, {'T','Y','U','I'}};
        fillArray(array);
//        int total = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j] + " ");
//                total += charToInt(array[i][j]);
//            }
//        }
//        System.out.println();
//        System.out.println(total);

    }
    public static int charToInt (char x) {
        int q = (int) x;
        return q;
    }
    public static void fillArray (char[][] arr) {
        try {
            arr = new char[4][4];
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Неверный размер массива");
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                System.out.print(arr[i][j] + " ");
                total += charToInt(arr[i][j]);
                } catch (MyArrayDataException e) {
                e.printStackTrace();
                System.out.println(arr[i][j] + " не приводится к int");
                } catch (Exception e) {
                System.out.println("Произошла ошибка");
                }
            }
        }
        System.out.println();
        System.out.println(total);

        }
    }
}
