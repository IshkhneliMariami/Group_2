import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    
	 //1 დაპროგრამების ენების სახელები
      System.out.println("C++");
      System.out.println("C#");
      System.out.println("java");
      System.out.println("pascal");
      System.out.println("php");
      System.out.println("JavaScropt");
      System.out.println("ActionScript");
      
     //2 განაყოფი,ნაშთი
     System.out.println("please, enter a and b");
     Scanner  first_input= new Scanner(System.in);
      int a = first_input.nextInt();
      int b = first_input.nextInt();
      System.out.println("a/b=" + a/b);
      System.out.println("b%a="+ b%a);
      
     //3 ჯამი, ნამრავლი
     System.out.println("please, enter a, b and c");
     Scanner second_input = new Scanner(System.in);
     int a = second_input.nextInt();
     int b = second_input.nextInt();
     int c = second_input.nextInt();
     System.out.println("a+b+c=" + (a+b+c));
     System.out.println("a*b*c=" + a*b*c);
     
      //4 სამნიშნა რიცხვის ციფრები
      System.out.println("please, enter number");
      Scanner third_input = new Scanner(System.in);
      String num = third_input.nextLine();
      for (int i = 0; i < num.length(); i++) 
        {
            System.out.println(num.charAt(i));
         }
         
      //5,6 რიცხვის ციფრთა ჯამი 
       int  b, sum = 0;
        System.out.println("please, enter the number:");
        Scanner fourth_input = new Scanner(System.in);
        int a = fourth_input.nextInt();
        while(a > 0)
        {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        System.out.println("Sum of Digits:"+ sum);  

//7 ევკლიდეს ალგორითმი (უსგ)
	public static int euclid(int a, int b) {
		if (a == 0 || b == 0) {
			return 1;
		}
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		if (a % b == 0) {
			return b;
		} else {
			return euclid(b, a % b);
		}
	}
 public static void main(String[] args) {
	    System.out.println("please,enter a and b");
	    Scanner fith_input= new Scanner(System.in);
	     int a = fith_input.nextInt();
       int b = fith_input.nextInt();
		 System.out.println("result: " + euclid(a,b));
		
//8 M-დან N-მდე
        System.out.println("please, enter M and N");
        Scanner sixth_input = new Scanner(System.in);
        int M = sixth_input.nextInt();
        int N = sixth_input.nextInt();
        for (int i=M; i<N; i++){
            System.out.print(i + " ");
        }
        
  //9 
  
  //11მასივში შემთხვევითი რიცხვები
       int[] my_arr = new int[8];
       for (int i = 0; i < 8; i++) {
            my_arr[i] = (int) (Math.random() * 1999);
        }
        System.out.println(Arrays.toString(my_arr));
        
	}
}
