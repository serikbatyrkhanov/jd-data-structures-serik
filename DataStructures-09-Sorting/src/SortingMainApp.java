import java.util.Arrays;

public class SortingMainApp {
    public static void main(String[] args) {
        var myarray=new int[]{8, 2, 4, 1, 3, -1};
        var quickSort= new MyQuickSort();
        quickSort.sort(myarray);
        System.out.println(Arrays.toString(myarray));
//        var myBubbleSort = new MyBubbleSort();
//        System.out.println(Arrays.toString(myBubbleSort.bubbleSort(myarray)));
//        var mySelectionSort = new MySelectionSort();
//        System.out.println(Arrays.toString(mySelectionSort.selectionSort(myarray)));
//        var myInsertionSort = new MyInsertionSort();
//        System.out.println(Arrays.toString(myInsertionSort.insertionSort(myarray)));

//        var myMergeSort= new MyMergeSort();
//        myMergeSort.mergeSort(myarray);
//        System.out.println(Arrays.toString(myarray));
    }
}
