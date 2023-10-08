package ru.yandex.practicum.theme20.lesson02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arrayA = {6, 3, 8};
//        int[] arrayB = {5, 2, 9};
//        int[] arrayC = mergeArray(arrayA, arrayB);
//        System.out.println(Arrays.toString(arrayC));
        int[] arrayStart = {6, 1, 3, 5, 2, 4, 7, 8};
        System.out.println(Arrays.toString(sortArray(arrayStart)));
    }


    public static int[] sortArray(int[] arrayA) {
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }

        // копируем левую часть от начала до середины
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;

        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    public static int[] mergeArray(int[] arrayА, int[] arrayB) {

        int[] arrayC = new int[arrayА.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionB == arrayА.length) {
                arrayC[i] = arrayB[i - positionB];
                //positionB++;
            } else if (positionA == arrayB.length) {
                arrayC[i] = arrayА[i - positionA];
                //positionA++;
            } else if (arrayА[i - positionA] < arrayB[i - positionB]) {
                arrayC[i] = arrayА[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }
}
