/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.HashMap;
public class Main
{
    static void duplicateWord(String str)
    {
       HashMap<String,Integer> hm= new HashMap<>();
       String[] s=  str.split(" ");
       for(String tempStr : s)
       {
          if (hm.get(tempStr)!=null) 
          {
            hm.put(tempStr,hm.get(tempStr)+1);
          }
          else
          {
              hm.put(tempStr,1);
          }
       }
       System.out.println(hm);
    }
	public static void main(String[] args) {
		duplicateWord("Hi This is is Ranndhir rathod rathod");
	}
}
