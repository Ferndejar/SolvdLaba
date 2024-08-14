import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number of Command Line Argument = " + args.length);

        System.out.println("User names before quick sort:");

        for(int i = 0; i< args.length; i++) {
            System.out.printf("Command Line Argument %d is %s%n", i, args[i]);
        }

        quickSort(args, 0, args.length - 1);
        System.out.println("User names after quick sort:");
        printArray(args);
    }

    static void swap(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(String[] arr, int beginIndex, int endIndex)
    {
        String pivot = arr[endIndex];
        int i = (beginIndex - 1);

        for (int j = beginIndex; j <= endIndex - 1; j++) {
            if (arr[j].compareToIgnoreCase(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, endIndex);
        return (i + 1);
    }

    static void quickSort(String[] arr, int beginIndex, int endIndex)
    {
        if (beginIndex < endIndex) {
            int pivot = partition(arr, beginIndex, endIndex);
            quickSort(arr, beginIndex, pivot - 1);
            quickSort(arr, pivot + 1, endIndex);
        }
    }
    public static void printArray(String[] arr)
    {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Command Line Argument %d is %s%n", i, arr[i]);
           // System.out.print(arr[i] + " ");
        }
    }
}