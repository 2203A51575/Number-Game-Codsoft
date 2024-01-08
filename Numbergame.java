package studyopedia;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class Main  
{
	public static void main(String[] args) {
	
    Scanner num = new Scanner(System.in);
	Random rand = new Random();
	Scanner ch = new Scanner(System.in);
	System.out.print("\nTASK - 1:\n");
	System.out.print("\n    -----    NUMBER GAME     -----     \n");
	System.out.print("\n The system generates a RANDOM NUMBER which you need to guess..!!\n You have 5 chances to guess correctly.\n Your Score will be based on how many attempts you take to guess the correct number\n\n");
	System.out.print("Wish you ALL THE BEST..!\n\nLet's start the game.....");
	boolean again = true;
	int limit = 5,c = 1,i;
	while(again)
	{
	int r = rand.nextInt(100);
	//System.out.println(r);
	System.out.print("**The number is randomly generated**\n Now, It's your turn to find it.\n\n");
	
	for(i = 1;i <= limit;i++)
	{
	System.out.print("Chance "+i+":\n Enter your guess:");
	int n = num.nextInt();
	if(n == r)
	{
	    System.out.print("Wow, You got the correct number..!\n");
	    System.out.println("No. of tries= "+c+"\n\n");
	    if(c == 1){
	        System.out.print("Your Score: 100");
	    }
	    else if(c == 2){
	        System.out.print("Your Score: 90");
	    }
	    else if(c == 3){
	        System.out.print("Your Score: 80");
	    }
	    else if(c == 4){
	        System.out.print("Your Score: 70");
	    }
	    else if(c == 5){
	        System.out.print("Your Score: 50");
	    }
	    
	    System.out.print("\nDo you want to continue the game with next round??? (Yes / No)\n");
	    String pa = ch.next();
	    System.out.print("\n");
	    again = pa.equalsIgnoreCase("Yes");
	    break;
	   
	}
	else if(n - 2 == r || n - 1 == r || n + 1 == r || n + 2 == r)
	{
	    System.out.print("You are close to win..!\n");
	}
	else if(n < r)
	{
	    System.out.print("Too low..!\n");
	}
	
	else if (n > r)
	{
	    System.out.print("Too high...!\n");
	}
	else
	{
	    System.out.print("Try Again\n");
	}
	c++;
	    }//End of for loop
	    
	    if(c >= 5)
	{
	    System.out.print("You have no chances left..\nSORRY, Your score is 0");
	    System.out.print("The Random Number is "+ r+"\n");
	    
	    System.out.print("\nWould you like to try again the game?? (Yes / No)\n");
	    String pa = ch.next();
	    System.out.print("\n");
	    again = pa.equalsIgnoreCase("Yes");
	    break;
	}
	}//end of while loop
	System.out.print("\nHope You Enjoyed this crazy game\nSee you Again..\n   ** BYE **");
}
}
