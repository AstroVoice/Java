package ru.geekbrains.javaone.lesson_b.home;

import java.util.Arrays;

public class HelloHomework {
    private static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            //array[i] = (array[i] == 1) ? 0 : 1;
			//array[i] = 1 - array[i];
            array[i] ^= 1;
    }

    private static void fillIn(int[] array, int shift, int step) {
        for (int i = 0; i < array.length; i++)
            array[i] = i * step + shift;
    }

    private static void doubling(int[] array){
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
    }

    private static int findMax(int[] array) {
        //bad idea
        Arrays.sort(array);
        return array[array.length - 1];
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int index : array)
            if (index < min)
                min = index;

        return min;
    }

    private static void crossFill(int[][] array){
        int strght, bckwd;
        for (strght = 0,
                     bckwd = array.length - 1;
             strght < array.length;
             strght++,
                     bckwd--) {
            array[strght][bckwd] = 1;
            array[strght][strght] = 1;
        }
    }

    private static void crossFill2(int[][] arr ) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    private static boolean checkBalance(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++){
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }

    private static void shifter(int[] array, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[lastIndex - j] = array[lastIndex - j - 1];
            }
            if (direction)
                array[lastIndex] = temp;
            else
                array[0] = temp;
        }
    }

    private static void shifter2(int[] array, int value) {
        boolean direction = value < 0;
        if (direction) value = -value;

        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            if (direction) {
                System.arraycopy(array, 1, array, 0, lastIndex);
                array[lastIndex] = temp;
            } else {
                System.arraycopy(array, 0, array, 1, lastIndex);
                array[0] = temp;
            }
        }
    }

    public static void main(String[] args) {
        /*
         * 1.   Создать массив, состоящий из элементов 0 и 1,
         * например, [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
         * и условия заменить 0 на 1, 1 на 0;
         */
        int[] bin = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
        System.out.println("1. Before:\t" + Arrays.toString(bin));
        change(bin);
        System.out.println("1. After:\t" + Arrays.toString(bin));

        /*
         * 2.   Создать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями
         * 1 4 7 10 13 16 19 22;
         */
        int[] arrInt = new int[8];
        fillIn(arrInt, 1, 3);
        System.out.println("2. Filled with cycle:\t" + Arrays.toString(arrInt));

        /*
         * 3.   Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         * пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
         */
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("3. Before:\t" + Arrays.toString(mas));
        doubling(mas);
        System.out.println("3. After:\t" + Arrays.toString(mas));

        /*
         * 4.   Создать квадратный двумерный целочисленный
         * массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        final int side = 10;
        int[][] dArr = new int[side][side];
        crossFill(dArr);
        for (int i = 0; i < dArr.length; i++) {
            for (int j = 0; j < dArr[i].length; j++) {
                System.out.print(dArr[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * 5.	* Задать одномерный массив и найти в нем
         * минимальный и максимальный элементы;
         */
        System.out.println("5. Maximum: " + findMax(mas));
        System.out.println("5. Minimum: " + findMin(mas));

        /*
         * 6.   ** Написать метод, в который передается не пустой
         * одномерный целочисленный массив, метод должен вернуть
         * true если в массиве есть место, в котором сумма
         * левой и правой части массива равны.
         * Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
         * checkBalance ([2, 1, 1, 2, 1]) → false,
         * checkBalance ([10, || 10]) → true,
         * граница показана символами ||, эти символы в массив не входят.
         */
        int[] balance = {0, 31, 7, 1, 23};
        System.out.print("6. Is the " + Arrays.toString(balance) + " balanced? ");
        System.out.println(checkBalance(balance));

        /*
         * 7.    *** Написать метод, которму на вход подаётся одномерный
         * массив и число n (может быть положительным, или отрицательным),
         * при этом метод должен сместить все элементы массива на n позиций.
         *
         * **** Для усложнения задачи нельзя пользоваться вспомогательными массивами
         */
        int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("7.  " + Arrays.toString(shiftArray));
        shifter(shiftArray, -3);
        System.out.println("-3 " + Arrays.toString(shiftArray));
        shifter2(shiftArray, 6);
        System.out.println("+6 " + Arrays.toString(shiftArray));


    }
}
