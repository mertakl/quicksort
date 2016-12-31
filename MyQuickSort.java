

import java.util.Random;

public class MyQuickSort {
    
    private int array[];
    private int length;
    static long startTime;
    
    //Main
    public static void main(String a[]){
        Random r=new Random();
        MyQuickSort sorter = new MyQuickSort();
        int[] input = new int[100000];
        for(int i=0;i<input.length;i++)
        {
        	input[i] = r.nextInt();
        }
        
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
        long endTime=System.currentTimeMillis();
        long total=endTime-startTime;
        System.out.println();
        System.out.println("Total time is "+total);
    }
    //Sort
    public void sort(int[] inputArr) {
        startTime=System.currentTimeMillis(); 
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
       
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
            
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                
                i++;
                j--;
            }
        }
        
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
   
}

