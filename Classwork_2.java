import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

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
        
  //9 მასივში უმცირესი, უდიდესი
    int [] array = {3,21,7,17,31,44,112,12331};    
    int minimum = array[0];
    int maximum = array[0];
    for(int i=1;i < array.length;i++){
        if(array[i] > maximum){
	      maximum = array[i];
	    }
      }
      for (int t=0; t < array.length; t++) {
          if(array[t] < minimum) {
              minimum = array[t];
          }
      }
      System.out.println("maximum = " + maximum);
      System.out.println("minimum = " + minimum);
	 
  //10 მასივი ზრდადობით
    int [] array = {3,21,7,17,31,44,112,12331};
    for (int i = 1; i < array.length; i++) {
      for (int t = i; t> 0; t--) {
        if (array[t] < array[t - 1]) {
          int n = array[t];
          array[t] = array[t - 1];
          array[t- 1] = n;
        }
      }
    }
    for(int i=0; i < array.length; i++){
        System.out.print(array[i]+" ");
    }
	

  //11 მასივში შემთხვევითი რიცხვები
       int[] my_arr = new int[8];
       for (int i = 0; i < 8; i++) {
            my_arr[i] = (int) (Math.random() * 1999);
        }
        System.out.println(Arrays.toString(my_arr));
	 
	 
   //12 მასივში შემთხვევითი რიცხვები კლებადობით
      int[] array = new int[8];
      for(int i = 0; i < array.length; i++) {
          array[i] = (int) (Math.random() * 1999);
      }
         int t;
         for (int i = 1; i < array.length; i++) {
              for (int j = i; j > 0; j--) {
                  if (array[j] > array [j - 1]) {
                  t = array[j];
                  array[j] = array[j - 1];
                  array[j - 1] = t;
            }
         }
       }
         for(int i=0; i < array.length; i++){
             System.out.print(array[i] + " ");
    }
        
	}
}
