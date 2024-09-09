public class Palindrome {
  static boolean isPalindrome(String a) {
    int i = 0;
    int j = a.length() - 1;

    while (i<j){
      if (a.charAt(i)!=a.charAt(j)) 
        return false;
			i++;
			j--;
    }
    return true;
  }

  public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)  
		{
		    if (isPalindrome(args[i]))
			System.out.print(args[i]+"\n");
	    }
    }   
}
