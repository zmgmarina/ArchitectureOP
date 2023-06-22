package seminarOOP_4;

public class ArrayUtils {

    public static Object[] replaceTwoElements(Object[]array, int index1, int index2){
        if (index1<0 || index1 >= array.length || index2 <0 || index2 >= array.length)
            throw new IndexOutOfBoundsException();
        Object[] buffArray = array.clone();
        Object buffElement = buffArray[index1];
        buffArray[index1] =  buffArray[index2];
        buffArray[index2] = buffElement;

        return buffArray;   // на выходе получаем массив типа Object
    }

    /*
    * Обобщенный метод
     */
    public static <T> T[] replaceTwoElements1(T[]array, int index1, int index2){ // здесь компилятор распознает тип передаваемого массива
        if (index1<0 || index1 >= array.length || index2 <0 || index2 >= array.length)
            throw new IndexOutOfBoundsException();
        T[] buffArray = array.clone();
        T buffElement = buffArray[index1];
        buffArray[index1] =  buffArray[index2];
        buffArray[index2] = buffElement;

        return buffArray;   // на выходе получаем массив типа Integer или String, тот тип, который принимали на вход
    }
}
