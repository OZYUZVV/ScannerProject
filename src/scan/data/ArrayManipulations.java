package scan.data;

import java.util.Arrays;

public class ArrayManipulations {
    public static int[] fillArray(int[] array) { // метод для заполнения массива, передает в параметрал любой интовый массив
        for (int i = 0; i < array.length; i++) {
            array[i] = UserInteractions.getNumberTyArray();
        }
        return array;
    }
    public static int[] getArrayWithoutDeleteNumber(int [] array, int number){
        int count = 0; // переменная которая следит за элементами новго массива, считает сколько элементов уже есть и это будет соответствовать индексу элемента в новом массиве
        int[] newArray = new int[array.length-1];//создаем массив на 1 элемент меньше
        for (int i = 0; i < array.length; i++) {
            if (number!=array[i]){ //если number не равняется элементу в старом массиве то мы его сохраняем -> newArray[count]
                newArray[count]=array[i];
                count++; //если count не увеличится то мы перезаписываем след элемент на место того элемента который нужно было удалить
            }

        }
        return newArray;
    }
    public static boolean isDeleteNumberInArray(int[] array, int number) {
        for (int num : array) {
            if (num == number)
                return true;
        }
        return false;
    }
    public static void printResult(int[] numbers, boolean check, int number) {
        if (check) {
            System.out.println("Да");
            System.out.println(Arrays.toString(getArrayWithoutDeleteNumber(numbers, number)));
        } else {
            System.out.println("Попробуйте еще раз");

        }

    }
}
