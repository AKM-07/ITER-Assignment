import java.util.*;
public class part2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		LinkedList q = new LinkedList();
		while(true)
		{
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Insert");
			System.out.println("2: Delete");
			System.out.println("3: Display");
			System.out.println("Enter your choice");
			int choice=in.nextInt();
			switch(choice)
			{
				case 0:
					System.exit(0);
				case 1:
					System.out.print("Enter the value to insert :");
					int i=in.nextInt();
					q.add(i);
				break;
				case 2:
					q.del();
				break;
				case 3:
					q.display();
				break;
				default:
				System.out.println("Invalid choice");
			}
		}
	}
}
