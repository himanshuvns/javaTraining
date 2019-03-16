//1 program
/*
import java.util.*;
public class Programs {
	static int n,sum=0;
	 static int sum1(int m)
	{
		for(int i=1;i<=m;i++)
		{
			if((i%3)==0||(i%5)==0)
					{
						sum=sum+i;
					}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs p=new Programs();
		System.out.println(p.sum1(15));
		
		
	}

}
*/

//2program
/*public class Programs {
	static int n,sum=0,sum1=0,sum2=0;
	 static int Difference(int m)
	{
		for(int i=1;i<=m;i++)
		{
			sum=sum+(i*i);
			sum1=sum1+i;
			sum2=(sum1*sum1);
			
		}
		return (sum-sum2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs p=new Programs();
		System.out.println(p.Difference(2));	
	}
}*/


//4program
/*import java.lang.Math;
public class Programs {
	static int n,a=0;
	static boolean x=false;
	 static boolean Power(int m)
	{
		for(int i=1;i<=100;i++)
		{
			//int a = (int)Math.pow(2, i);

		if(m==(int)Math.pow(2, i))
		{
			x=true;
			break;
		}
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs p=new Programs();
		System.out.println(p.Power(17));	
	}
}
*/

//Assignment 1 program
/*public class Programs {
	static int a;
	static char b;
	static boolean c;
	static byte d;
	static short e;
	static long f;
	static double g;
	static float h;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}
}
*/

//2 program
/*public class Programs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programs p = new Programs();	
	long a=10255425;
	int b=(int)a;
	double c = 24581.356;
	float d = (float)c;
	
	char e = 'h';
	int f = e;
	
	int g = 104;
	char h = (char)g;
	
	System.out.println(b);
	System.out.println(d);
	System.out.println(f);
	System.out.println(h);
	
	}
}*/

//prime or not
/*public class Programs {
	static boolean flag=true;
	static boolean prime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if((n%i==0)&(n%n==0))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs p = new Programs();
		System.out.println(p.prime(12));
	}
}*/

//4 program
/*public class Programs {
	static int sum=0,avg;
	static int average(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		avg=sum/n;
		return avg;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programs p = new Programs();
		System.out.println(p.average(4));
	}
}*/

//5 program

/*public class Programs {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(b[i][j]+"    ");
			}
			System.out.println("\n");
	}
	}
}*/

//6 program
/*public class Programs {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int j=1;j<=4;j++)
			{
				for(int i=1;i<=j;i++)
				{
				System.out.print("*");
				}
				System.out.println("\n");
			}
	}
}*/

//employee
/*
import java.util.*;
class Employee
{
	int emp_id;
	String emp_name;
	String date;
	char design_code;
	String dept;
	int basic;
	int hra;
	int it;
	Employee(int emp_id,String emp_name,String date,char design_code,String dept,int basic,int hra,int it)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.date=date;
		this.design_code=design_code;
		this.dept=dept;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
	}
}
public class Programs
{
	public static void main(String as[])
	{
		Employee emp[] = {new Employee(1001,"ashish","01/04/2009",'e',"R&D",25400,253,12556),
						new Employee(1002,"shushma","23/08/2012",'c',"PM",25580,2522,2758),
						new Employee(1003,"rahul","12/11/2008",'k',"Acct",254256,1233,24856),
						new Employee(1004,"chahat","29/01/2013",'r',"Front Desk",21240,2458,2485),
						new Employee(1005,"ranjan","16/07/2005",'m',"engineer",284570,2125,254254),
						new Employee(1006,"suman","01/01/2000",'e',"manufacturing",251254,2458,2500),
						new Employee(1007,"tanmay","12/06/2006",'c',"PM",211420,2154,251254)};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int id= sc.nextInt();
		for(Employee e:emp)
		{
			if(e.emp_id==id)
			{
				System.out.println(e.emp_name);
			}
		}
		
		
	}
}*/

//bubble sort
/*public class Programs
{
	public static void main(String as[])
	{
		int temp=0;
		int a[]= {1,5,2,48,56,25};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}*/


//check number is increasing or not
/*public class Programs
{
	public static void main(String as[])
	{
		int rem1,rem2;
		int a=12345;
		rem1=a%10;
		a=a/10;
		while(a!=0)
		{
			rem2=a%10;
			if(rem1>rem2)
			{
				continue;
			}
			else
			{
				System.out.println("number is not in incresing order");
			}
			a=a/10;
			
			
		}
		
	}
}*/

































