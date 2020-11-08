import java.util.Scanner;
public class Val {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer: ");
		String x = sc.next();
		int res1= AnaLR(x);
		int res2= AnaRL(x);
		int sum = res1+res2;
		//System.out.println(sum);
		boolean bool=Div10(sum);
		if(sum%10==0)
			System.out.println(x +" is valid");
		else
			System.out.println(x + " is invalid");
	}
	//odd numbers of string
	public static int AnaRL(String num) {
		int res2 = 0;
		for (int i = num.length() -1; i>=0; i-=2) {
			res2+=Integer.parseInt(num.charAt(i)+"");
		}
		return res2;
	}
	//even numbers of string
	public static int AnaLR(String x) {
		int res1=0;
		for (int i=x.length()-2;i>=0;i-=2) {
			int y=Integer.parseInt(x.charAt(i)+"");
			y*=2;
			//single digit
			if(y<10)
				res1+=y;
			//double digit
			else
				res1+=y/10+y%10;
			}
		return res1;
	}
	public static boolean Div10(int sum){
		boolean bool= false;
		if(sum%10==0)
			bool=true;
		return bool;
	}
}