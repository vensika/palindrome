package testproject;

public class pal {
	public static void main(String args[])
	  {
	    int n;
	    int mod;
	    int rev=0;
	    int temp;
	    n=Integer.parseInt(args[0]);
	    temp=n;
	    while(n>0)
	    {
	      mod=n%10;
	      rev=(rev*10)+mod;
	      n=n/10;
	    }
	    if(temp==rev)
	    System.out.println("palindrome");
	    else if(temp!=rev)    
	    System.out.println("not palindrome");
	     }
	     }
	     
