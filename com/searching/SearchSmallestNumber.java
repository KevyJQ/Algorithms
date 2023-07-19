public class SearchSmallestNumber {
  // Running time is the number of operations that an algorithm will do.
  // O(n) == c * n
  //     where n is the number elements
  //     c is an small constant

  // Running time: line :O(16) porque son 16 numeros los que va a revisar
  public static int searchSmallest(int[] array){
    int small = array[0];
    for(int i =0;i<array.length; i++){
      if(array[i] < small){
        small = array[i];
      }
    }
    return small;
  }
  
  public static void main(String []args) {
    int numeros[] = {
       78, 77, 75,  74, 65, 63, 30, 20, 12, 1, 2, 6, 5, 4, 8, 10};
    System.out.println(searchSmallest(numeros));
  }
}