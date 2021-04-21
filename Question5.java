import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int[] intList = new int[num];
    int[] occurrenceList = new int[num];
    for(int i = 0; i < num; i++){
     int input = in.nextInt();
     intList[i] = input;    
    }
    
    for(int i = 0; i < num; i++){
     int count = 0;
     for(int y = 0; y < num; y++){
       if(intList[i] == intList[y]){
        count++;
       }
     }
     occurrenceList[i] = count;
    }
    
    int amount = occurrenceList[0];
    int index = 0;
    for(int i = 0; i < num; i++){
     if(i+1 == num){
       break;
     }
     if(amount < occurrenceList[i+1]){
      amount = occurrenceList[i+1];
      index = i+1;
     }
    }
    System.out.println(intList[index]);
    
  }
}
