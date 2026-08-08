package GenericClass;

public class Problem1 {

    public static <T> void printArray(T[] array) {
        for (T i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        String[] arr2 = {"Annafee", "Srejon", "Shohan"};

        printArray(arr2);
    }
}

