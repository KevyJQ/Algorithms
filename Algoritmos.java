


class Main {

  // O() = c * , donde c es una constante small.

  // O(n) = c * n
  // Running time of the linear search O(n) where n is
  // the number of elements in the array.
  // Returns the index where the number is located,
  // Returns -1 if the number is not found in the array.
  public static int linearSearch(int num, int[] array) {
    for(int i=0; i < array.length; i++){ // O(n)
      if(array[i] == num) // O(1)
        return i; // O(1)
    }
    return -1; // O(1)
  }
  // O(n) * O(1) + O(1) = O(n) + O(1) = O(n)


  /*
   Los elementos tienen que estar ordenados
  
    1  3  4 89 90 114 200 222 233 250  299  300 345 400 500

              Binary Search Tree
              
                         222                       2 ^ 0 = 1    Level 1
                     /          \
                    89             300             2 ^ 1 = 2    Level 2
                  /   \          /     \ 
                4      114      250      400       2 ^ 2 = 4    Level 3
              /  \     /  \     /   \    /  \
             1    3   90  200  233 299  345 500    2 ^ 3 = 8    Level 4

          2 ^ max level -1 = 2 ^ 4 -1 = 15 
          2 ^ x = n
          x = log2(n)
          2 ^ x = 15
          x = log2(15) ~ 4
          log2(1000000) ~ 19
  */
  // Returns the index where the number is located,
  // Returns -1 if the number is not found in the array.
  public static int binarySearch(int num, int[] array) {
    int left=0;
    int right=array.length-1;
    int midIdx = 0;
  
    while(left <= right){
      midIdx = left + (right - left)/2;
      int value = array[midIdx];
      if(array[midIdx] == num){
          return midIdx;
      } else if(value < num){
        left = midIdx + 1;
      } else {
        right = midIdx - 1;
      }
    }
    return -1;
  }

// Implementar binary search recursivamente
// Subir codigo a github
  
  public static void main(String[] args) {
    int numbers[] = {1, 3, 4, 89, 90, 114,
                     200, 222, 233, 250, 299,
                     300, 345, 400,500};
    print(numbers);
    System.out.println(linearSearch(23, numbers));
    System.out.println(linearSearch(100, numbers));

    System.out.println(binarySearch(1174, numbers));
    System.out.println(binarySearch(0, numbers));
    System.out.println(binarySearch(58, numbers));
    System.out.println(binarySearch(1, numbers));
    System.out.println(binarySearch(1111, numbers));
    System.out.println(binarySearch(250, numbers));
    System.out.println(binarySearch(500, numbers));
  }

  public static void print(int numbers[]){
    for(int num: numbers){
        System.out.print(num+" ");
      }
    System.out.println();
  }
}