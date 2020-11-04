package ru.geekbrains.Lesson;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Массив 1 'без ошибок':");
        String[][] array1 = {{"100","200","300","400"}, {"100","200","300","400"}, {"100","200","300","400"}, {"100","200","300","400"}};
        checkStringArray(array1);
        System.out.println();

        System.out.println("Массив 2 'большего размера':");
        String[][] array2 = {{"1","1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"},{"5","5","5","5"}};
        checkStringArray(array2);
        System.out.println();

        System.out.println("Массив 3 'не числовые символы в массиве':");
        String[][] array3 = {{"Hello","200","300","400"}, {"Yes","200","300","400"}, {"Ok","200","300","400"}, {"Hi","200","300","400"}};
        checkStringArray(array3);
        System.out.println();

        System.out.println("Массив 4 'меньшего размера':");
        String[][] array4 = {{"1","2","3"}, {"1","2","3"}, {"1","2","3"},{"1","2","3"}};
        checkStringArray(array4);
        System.out.println();

        System.out.println("Массив 5 'меньшего размера':");
        String[][] array5 = {{"1","1","1","1"}, {"2","2","2","2"}, {"3","3","3","3"}};
        checkStringArray(array5);
        System.out.println();
    }

    public static int stringToInt (String x) {
        try {
            int asInt = Integer.parseInt (x);
            return asInt;
        } catch (NumberFormatException e){} /*Неверное преобразование символьной строки в числовой формат*/
        return -1;
    }

    public static void checkStringArray (String[][] arr) {
        try {
            int total = 0;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr.length != 4 || arr[j].length != 4) {
                        throw new MyArraySizeException();
                    }
                    index++;
                    try {
                        int x = stringToInt(arr[i][j]);
                        if (x == -1) {
                            throw new MyArrayDataException ();
                        }
                        total += stringToInt(arr[i][j]);
//                        System.out.print(arr[i][j] + "-" + index + ", ");
                    } catch (MyArrayDataException e) {
                        System.out.println("индекс №" + index + " (" + arr[i][j] + ") не приводится к int; ");
                    }
                }
            }
            System.out.println("Сумма: " + total);
        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива");
        }
    }

}
