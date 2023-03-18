import java.util.Scanner;
class selectTransaction
{
	Scanner sc = new Scanner(System.in);
	int bal=2000;
	public void select()
	{

		System.out.println("-:SELECT BELOW TRANSACTIONS:-");
	    System.out.println(">FOR *DEPOSIT* PRESS 1");
		System.out.println(">FOR *BALANCE* PRESS 2");
		System.out.println(">FOR *CASH WITHDRAWALS* PRESS 3");
		transaction();
	}
	public void transaction()
	{
		int num =sc.nextInt();
		if(num==1)
		{
			System.out.println("ENTER THE MONEY YOU WANT TO ADD:");
	        int num1=sc.nextInt();
		    bal=bal+num1;
			System.out.println("*MONEY ADDED SUCCESSFULLY*");
			System.out.println("ENTER 0 IF YOU WANT TO CONTINUE (OR) ENTER 4 FOR LOG OUT:");
			int Q =sc.nextInt();
				if(Q==0)
				{
					select();
				}
				else if(Q==4)
				{
					System.out.println("THANK YOU VISIT AGAIN");
				}
				else{
					System.out.println("SORRY WRONG INPUT");
				}
		}
		else if(num==2)
		{
			System.out.println("BALANCE = "+bal);
			System.out.println("ENTER 0 IF YOU WANT TO CONTINUE (OR) ENTER 4 FOR LOG OUT:");
			int Q =sc.nextInt();
				if(Q==0)
				{
					select();
				}
				else if(Q==4)
				{
					System.out.println("THANK YOU VISIT AGAIN");
				}
				else{
					System.out.println("SORRY WRONG INPUT");
				}
		}
		else if(num==3)
		{
			System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAWALS:");
			int num1 = sc.nextInt();
			if(num1<=bal)
			{
				if(num1==500||num1==1500||num1==2000||num1==1000)
				{
					bal-=num1;
				    System.out.println("*WITHDRAWALS IS SUCCESSFULLY*");
					System.out.println("ENTER 0 IF YOU WANT TO CONTINUE (OR) ENTER 4 FOR LOG OUT:");
					int Q =sc.nextInt();
				    if(Q==0)
				    {
					    select();
				    }
				    else if(Q==4)
				    {
					    System.out.println("THANK YOU VISIT AGAIN");
				    }
					else{
					System.out.println("SORRY WRONG INPUT");
				    }
				}
				else
			    {
				    System.out.println("ENTER THE AMOUNT IN 500 OR 1000 OR 1500 OR 2000");
					System.out.println("SORRY WRONG INPUT");
			    }
			}
			else
			{
				System.out.println("INSUFFICIANT BALANCE IN YOUR ACCOUNT");
			}
		}
		else{
			System.out.println("SORRY WRONG INPUT");
		}
	}	
}
class pinAcc extends selectTransaction
{
	Scanner sc = new Scanner(System.in);
	int pin;
	
	public void password(int pin)
	{
		System.out.println("----WELCOME TO SBI BANK----");
		System.out.println("ENTER YOUR FOUR DIGIT PIN NUMBER: ");
		int pass = sc.nextInt();
		if(pass==pin)
		{
			select();
		}
		else{
			System.out.println("INVALID ATM PIN");
		}
	}
}
class display extends pinAcc
{
	Scanner sc = new Scanner(System.in);
	int num;
	
	public void displaynum()
	{
		System.out.println("ENTER ANY NUMBER BETWEEN 10 AND 99 For eg.22:");
		System.out.println("PRESS *ENTER* IF THE NUMBER IS DISPLAYED:");
		int dis = sc.nextInt();
		if(dis>=10&&dis<=99)
		{
			password(1234);
		}
		else{
			System.out.println("SORRY WRONG DISPLAY NUMBER");
		}
	}
}
class choose extends display
{
	Scanner sc = new Scanner(System.in);
	int banking;
	public choose(int banking)
	{
		this.banking=banking;
	}
	public void selectBanking()
	{
		System.out.println("PLEASE CHOOSE *BANKING* FORCASH *WITHDRAWALS*");
		System.out.println("DO YOU WANT SELECT BANKING THEN TYPE *1* :");
		int n = sc.nextInt();
		if(n==banking)
		{
		    displaynum();
		}
		else
		{
			System.out.println("SORRY WRONG BANKING");
		}
	}
}
class Account 
{
	public static void main(String[] args) 
	{
		choose c1 = new choose(1);
		c1.selectBanking();
		
	}
}
