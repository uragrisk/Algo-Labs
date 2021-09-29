package ua.lviv.iot;

import java.util.Arrays;

public class Transformer {
    private int[] array_for_sort;
    private String order;
    private static long execution_time;
    private static int comparisons_counter;
    private static int swap_counter;

    Transformer(String order, String string_array){
        this.order = order;
        String[] string = string_array.split(",");
        array_for_sort = new int[string.length];
        for (int i = 0; i < string.length; i++){
            array_for_sort[i] = Integer.parseInt(string[i]);
        }
    }

    public void print_array() {
        System.out.println(Arrays.toString(array_for_sort));
    }

    public static int[] quick_sort(int[] array_for_sort, String order, int start, int end){
        if (array_for_sort.length == 0)
            return array_for_sort;

        if (start >= end)
            return array_for_sort;

        int middle = start + (end - start) / 2;
        int pivot = array_for_sort[middle];

        int i = start, j = end;
        while(i <= j) {
            if(order.equals("asc")){
                while(array_for_sort[i] < pivot){
                    i++;
                    comparisons_counter++;
                }
                while (array_for_sort[j] > pivot){
                    j--;
                    comparisons_counter++;
                }
            }

            if(order.equals("desc")){
                while(array_for_sort[i] > pivot){
                    i++;
                    comparisons_counter++;
                }
                while(array_for_sort[j] < pivot){
                    j--;
                    comparisons_counter++;
                }
            }
            comparisons_counter = comparisons_counter + 2;
            if(i <= j){
                if(i!=j){
                    swap_counter++;
                    int temp = array_for_sort[i];
                    array_for_sort[i] = array_for_sort[j];
                    array_for_sort[j] = temp;
                }
                i++;
                j--;
            }
        }

        if(start < j){
            quick_sort(array_for_sort, order, start, j);
        }

        if (end > i){
            quick_sort(array_for_sort, order, i, end);
        }

        return array_for_sort;
    }

    public void sort_result(){
        execution_time = System.nanoTime();
        Transformer.comparisons_counter = 0;
        Transformer.swap_counter = 0;
        Transformer.quick_sort(array_for_sort, order, 0, array_for_sort.length-1);
        System.out.print("Quick Sort:");
        if (order.equals("asc"))
            System.out.println("(Ascending):");
        else
            System.out.println("(Descending):");
        System.out.println("Execution time: " + (System.nanoTime()-execution_time)+"ns");
        System.out.println("Comparisons: " + comparisons_counter);
        System.out.println("Swaps: " + swap_counter);
        System.out.print("Sorted array: ");
        print_array();

    }

}
