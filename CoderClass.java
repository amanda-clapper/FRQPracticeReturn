/*
 * 
 */
public class CoderClass
{
public String shorten( String word, int n)
{
    String wordEnd = word.substring(n);
   for (int num = 0; num < n; num++)
    {
    System.out.print("#");
    }
    System.out.print(wordEnd);
}
public int whatsTheSum(int n)
{
  int sum = 0;
  for( int i=1; i<=n; i++)
  {
    sum+= (int)(1+ Math.random()*20);
  }
  return sum;
}
public boolean hasAnE (String s)
{
    
}
}