
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shivam
 */
class TestClass {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      String numbers=s.nextLine();
      String numbersDe[]=numbers.split(" ");
      int counter=0;
      int numberCon[]=new int[numbersDe.length];
//      Long resSort[]=new Long[4];

      List<Integer> resSort=new ArrayList<>();
      //int res=0;
      
     for(String num: numbersDe)
      {
          numberCon[counter]=Integer.parseInt(num);
          counter++;
      }
        
   for(int j=0;j<(counter-2);j++)
   {
       int temp=numberCon[j]+numberCon[j+2];
       if(temp==numberCon[j+1])
       {
           resSort.add(temp);
           //res++;
       }
       
   }
  Collections.sort(resSort);
  for(Integer finRes:resSort)
  {
      System.out.print(finRes+" ");
  }
    }
}
