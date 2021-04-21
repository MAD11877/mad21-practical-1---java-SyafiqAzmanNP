import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int i = 0; i < num; i++){
      String line = "*";
      int x = i;
      while(x < num-1){
        line = line + "*";
        x++;
        }     
      System.out.println(line);       
    }
    
    
  }
}
