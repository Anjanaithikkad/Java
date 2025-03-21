import java.util.Arrays;
import java.util.Scanner;
class arraystring
{
	void userdefine(String str[],int length)
	{
		int i,j;
		String temp;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("\n Sorted Array using user defined method");
		for(i=0;i<length;i++)
		{
			System.out.println(str[i]);
		}
	}	
	public static void main(String args[])
	{
		int i,length,option;
		arraystring userSort=new arraystring();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of words in array:");
		length=sc.nextInt();
		String str[] = new String[length];
		System.out.println("Enter the Words in Array:");
		for(i=0;i<length;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("\n Entered Array is:");
		for(i=0;i<length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("\n Options:");
		System.out.println("1.Built in method");
		System.out.println("2.User defind function\n");
		System.out.println("3.exit");
		System.out.println("Choose your options:");
		option=sc.nextInt();
		while(option!=3)
		{
			switch(option)
			{
				case 1:Arrays.sort(str);
					System.out.println("\n Sorted Array using in built in method:");
					for(i=0; i<length;i++)
       					{
       						System.out.println(str[i]);
       					}
       					break;
				case 2:userSort.userdefine(str,length);
					break;
				default:System.out.println("invalid  option");
					break;
			}
			System.out.println("\nChoose your option:");
			option=sc.nextInt();
		}
	}
}
