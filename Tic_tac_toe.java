import java.util.Scanner;
class Tic_tac_toe
{
	static boolean check_win(String a[][])
	{
		int i,j,ping=0;
		for(i=0;i<3;i++)
		{
			if((a[i][0].equals(a[i][1]))&&(a[i][1].equals(a[i][2])))
				ping++;
		}
		for(i=0;i<3;i++)
		{
			if((a[0][i].equals(a[1][i]))&&(a[1][i].equals(a[2][i])))
				ping++;
		}
		if((a[0][0].equals(a[1][1]))&&(a[1][1].equals(a[2][2])))
			ping++;
		if((a[0][2].equals(a[1][1]))&&(a[1][1].equals(a[2][0])))
			ping++;
		if(ping==0)
			return false;
		else
			return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a[][]=new String[3][3];
		String t1,t2;
		int p1,p2,flag1=1;
		boolean flag=false;
		int i,j,count=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				String s=String.valueOf(++count);
				a[i][j]=s;
			}
		}
		
		System.out.println("Choose token for player 1:");
		t1=sc.next();
		System.out.println("Choose token for player 2:");
		t2=sc.next();
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			     if(j==2)
				System.out.print("   "+a[i][j]);
			     else
					 System.out.print("  "+a[i][j]+"  |");
			}
			if(i!=2)
			{
				System.out.println();
			System.out.println("---------------------");
			}
		}
		count=0;
		int arr[]=new int[10];
		while(flag==false)
		{
			if(count>=9)
                        {
				System.out.println("\nGAME DRAW");
				break;
			}
			count++;
		
			if(flag1==1)
			{

                                while(true)
				{
				System.out.print("\nPlayer 1's turn:");
				p1=sc.nextInt();
                                if((p1<1)||(p1>9))
					System.out.println("Please enter a valid number");
                                else if(arr[p1]==1)
                                	System.out.println("This place is already taken");
				else
				{
					arr[p1]=1;
					break;
				}
                                }
				
				flag1=0;
			}
			else
			{
				while(true)
				{
				System.out.print("\nPlayer 2's turn:");
				p1=sc.nextInt();
                                if((p1<1)||(p1>9))
					System.out.println("Please enter a valid number");
                                else if(arr[p1]==1)
                                	System.out.println("This place is already taken");
				else
				{
					arr[p1]=1;
					break;
				}
                                }
				
				
				flag1=1;
			}
			String s1=String.valueOf(p1);
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(a[i][j].equals(s1))
					{
						if(flag1==0)
						a[i][j]=t1;
				       		else
						a[i][j]=t2;
					}
				}
			}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(j==2)
					System.out.print("   "+a[i][j]);
			     		else
					System.out.print("  "+a[i][j]+"  |");
				}
				if(i!=2)
				{
				System.out.println();
				System.out.println("---------------------");
				}
			}
			flag=check_win(a);
			if(flag==true)
			{
				System.out.println();
		
				if(flag1==0)
					System.out.println("PLAYER 1 IS THE WINNER");
				else
					System.out.println("PLAYER 2 IS THE WINNER");
			}
		}
		
	}
}
