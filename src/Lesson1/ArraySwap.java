package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySwap<T> {
    private T[] myArray;

    public ArraySwap(T... array) {
        this.myArray = array;
    }

    public T[] getMyArray() {
        return myArray;
    }

    public void setMyArray(T[] myArray) {
        this.myArray = myArray;
    }
     public void swap (T[] myArray, int i, int j) {
        if (i <= myArray.length && j <= myArray.length && i != j){
           T temp = myArray[i];
           myArray[i] = myArray [j];
           myArray[j] = temp;
        } else {
            System.out.println("Wrong i or j");
        }


    }
    public ArrayList<T> arrToList (T[] toList) {
        ArrayList<T> myArraylist = new ArrayList<>();
        Collections.addAll(myArraylist, toList);
        return myArraylist;
    }

}
