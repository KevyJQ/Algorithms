/*
 Selection Sort

 Selection sort picks the smallest number and put in in the front of the array,
 swapping the element in the front. Then it selects the next smallest element and
 swapped by the second element in the array. This continues till all the elements
 are sorted.

 5 6 99 2 10 1 3

 index = 0

1 6 99 2 10 5 3

  index = 1

1 2 99 6 10 5 3
  
index = 2

1 2 3 6 10 5 99

index = 3

1 2 3 5 10 6 99

index = 4

1 2 3 5 6 10 99

index = 5

1 2 3 5 6 10 99

*/

public class SelectionSort {

  /*
     Running time
     - Worst case: O(m) where m is the size of the array.
     - Best cases: O(1) when index == array.length
  */
  private static int findIndexOfSmallestNumber(int[] array, int index){
    int smallIndex = index;
    for(int i = index + 1; i < array.length; i++){
      if(array[i] < array[smallIndex]) {
        smallIndex = i;
      }
    }
    return smallIndex;
  }

  private static void swap(int []array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  /*
  * Running time
    O(n * m) ==  O (n * n) == O(n ^ 2)
  
  */
  public static void sort(int []array) {
    // n where n is the elements in the array
    for(int i = 0; i < array.length - 1;i++){  // n 
      int smallIndex = findIndexOfSmallestNumber(array, i); // m
      swap(array, smallIndex, i);
    }
  }

  public static void print(int[] array){
    for(int a : array){
      System.out.print(a+" ");
    }
  }

  public static void main(String []args) {
    System.out.println("Selction sort");
    int[] numbers = {5, 6, 99, 2, 10, 1, 3};
    sort(numbers);
    print(numbers);
    //System.out.println(findIndexOfSmallestNumber(numbers,0));
  }
}