package scan.application;

import scan.data.ArrayManipulations;

import static scan.data.UserInteractions.*;

public class Main {
    public static void main(String[] args) {
        int arraySize = getSizeArray();
        int[] myArray = new int[arraySize];
        ArrayManipulations.fillArray(myArray);
        int deleteNumber=getNumberTyDelete();
       boolean checkNumber = ArrayManipulations.isDeleteNumberInArray(myArray,deleteNumber);
        ArrayManipulations.printResult(myArray,checkNumber,deleteNumber);
        closeScanner();
    }
}
