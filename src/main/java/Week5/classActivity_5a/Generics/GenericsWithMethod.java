package Week5.classActivity_5a.Generics;

public class GenericsWithMethod {

    public static <E> void printArr(E[] elements){

        for(E e : elements){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {10,20,30,40,50};
        Character[] charArr = {'a','b','c','d','e'};

        System.out.println("printing Integer Array: ");
        printArr(intArr);

        System.out.println("printing character array: ");
        printArr(charArr);
    }
}
