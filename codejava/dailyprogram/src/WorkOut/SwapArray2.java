package WorkOut;



import java.util.Arrays;

public class SwapArray2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};

		    
		int temp = arr[0];
		arr[0] = arr[5];
		arr[5] =temp;
		
		int temp1 = arr[3];
		arr[3] = arr[4];
		arr[4] =temp1;
		
		System.out.println(Arrays.toString(arr));
		
	}
}


//      int indexToSwap10 = findIndex(arr, 10);
//      int indexToSwap60 = findIndex(arr, 60);
//      int indexToSwap30 = findIndex(arr, 30);
//      int indexToSwap40 = findIndex(arr, 40);
//
//      
//      int temp = arr[indexToSwap10];
//      arr[indexToSwap10] = arr[indexToSwap60];
//      arr[indexToSwap60] = temp;
//
//      temp = arr[indexToSwap30];
//      arr[indexToSwap30] = arr[indexToSwap40];
//      arr[indexToSwap40] = temp;
//
//      
//      System.out.println(Arrays.toString(arr));
//  }
//
//  private static int findIndex(int[] arr, int num) {
//      for (int i = 0; i < arr.length; i++) {
//          if (arr[i] == num) {
//              return i;
//          }
//      }
//      return -1; 
//  }
//}
