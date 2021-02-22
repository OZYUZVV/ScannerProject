package scan.data;

import java.util.Scanner;

public class UserInteractions {

  public static Scanner ss = new Scanner(System.in);
    //размер массива
    public static int getSizeArray(){
        System.out.println("Задайте размер массиву");
        return ss.nextInt();
    }
    //заполнение массива
    public static int getNumberTyArray(){
        System.out.println("Задайте число ");
        return ss.nextInt();
    }
    // число для удаления
    public static int getNumberTyDelete(){
        System.out.println("Выберите число для удаления");
        return ss.nextInt();
    }
    public static void closeScanner(){
        ss.close();
    }


    }

