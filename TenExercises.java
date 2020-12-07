import java.util.Scanner;

public class TenExercises {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		AddTwoBinaryNumbers();
		MultiplyNumbertoTen();
		CalculateAverage();
		SumMultiplyDividenRemainderoftwoNumber();
		MultiplicationuptoTen();
		DecimaltoBinary();
		ReverseString();
		IntegerAndFactors();
		ModulesofTwoNumbers();
		ProductofBinary();
		
	}
	public static void AddTwoBinaryNumbers() {
		Scanner input = new Scanner(System.in);
		
		long binary1, binary2;
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		Scanner in = new Scanner(System.in);
		
		 System.out.print("Input first binary number: ");
		 binary1 = in.nextLong();
		 System.out.print("Input second binary number: ");
		 binary2 = in.nextLong();
		 
		 while (binary1 != 0 || binary2 != 0) 
		 {
			 sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
			 remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
			 binary1 = binary1 / 10;
			 binary2 = binary2 / 10;
		 }
		 if (remainder != 0) {
			 sum[i++] = remainder;
		 }
		 --i;
		 System.out.print("Sum of two binary numbers: ");
		 while (i >= 0) {
			 System.out.print(sum[i--]);
	}
		 System.out.print("\n");
}
	public static void ComputeSquareRoot() {
	Scanner input = new Scanner(System.in);
	
	int num;
	Scanner in = new Scanner(System.in);
	System.out.print("Input a positive integer: ");
	int n = in.nextInt(); 
	System.out.printf("Square root of %d is: ",n);
	System.out.println(sqrt(n)); 
}
	private static int sqrt(int num) {
		if (num == 0 || num == 1) {
			return num;
		}
		int a = 0;
		int b = num;
		while (a <= b) {
			int mid = (a + b) >> 1;
		if (num / mid < mid) {
			b = mid - 1;
		}else {
			if (num / (mid + 1) <= mid) {
				return mid;
			}
			a = mid + 1;
		}
	}
		return a;
	}
	public static void MultiplyNumbertoTen() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int num1 = input.nextInt();
		
		for (int i=0; i< 10; i++){
			   System.out.println(num1 + " x " + (i+1) + " = " + 
			     (num1 * (i+1)));
		}
	}

		public static void CalculateAverage() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Input first number: ");
			int num1 = in.nextInt();
			
			System.out.print("Input second number: ");
			int num2 = in.nextInt();
			
			System.out.print("Input third number: ");
			int num3 = in.nextInt();
			
			System.out.print("Input fourth number: ");
			int num4 = in.nextInt();
			
			System.out.print("Enter fifth number: ");
			int num5 = in.nextInt();
			
			
			System.out.println("Average of five numbers is: " + 
					 (num1 + num2 + num3 + num4 + num5) / 5);
		}
		
		public static void SumMultiplyDividenRemainderoftwoNumber() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Input first number: ");
			int num1 = in.nextInt();
			
			System.out.print("Input second number: ");
			int num2 = in.nextInt();
			
			System.out.println(num1 + " + " + num2 + " = " + 
					(num1 + num2));
			
			System.out.println(num1 + " - " + num2 + " = " + 
					(num1 - num2));
			
			System.out.println(num1 + " x " + num2 + " = " + 
					  (num1 * num2));
			
			System.out.println(num1 + " / " + num2 + " = " + 
					  (num1 / num2));
			
			System.out.println(num1 + " mod " + num2 + " = " + 
					  (num1 % num2));
		}
		
		public static void MultiplicationuptoTen() {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Input a number: ");
			int num1 = in.nextInt();
			
			for (int i=0; i< 10; i++){
				System.out.println(num1 + " x " + (i+1) + " = " + 
					     (num1 * (i+1)));
			}
		}
		
			public static void DecimaltoBinary() {
			
				int dec_num, quot, i=1, j;
				int bin_num[] = new int[100];
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Input a Decimal Number : ");
			dec_num = scan.nextInt();
			
			quot = dec_num;
			
			while(quot != 0)	
		{
			bin_num[i++] = quot%2;
			quot = quot/2;
		}
			
			 System.out.print("Binary number is: ");
			 for(j=i-1; j>0; j--)
			 {
				 System.out.print(bin_num[j]);
			 }
			 System.out.print("\n");
}
			
			public static void ReverseString() {
				Scanner in = new Scanner(System.in);
				System.out.print("Input a string: ");
				char[] letters = in.nextLine().toCharArray();
				System.out.print("Reverse string: ");
				for (int i = letters.length - 1; i >= 0; i--) {
					System.out.print(letters[i]);
				}
				System.out.print("\n");
			}
			
			public static void IntegerAndFactors() {
				Scanner in = new Scanner(System.in);
				System.out.print("Input an integer: ");
				int x = in.nextInt(); 
				
				System.out.println(result(x));
			}
			public static int result(int num) {	
				int ctr = 0;
				for(int i=1; i<=(int)Math.sqrt(num); i++) {
					if(num%i==0 && i*i!=num) {
						ctr+=2;
					} else if (i*i==num) {
						ctr++;
					}
				}
				return ctr;
			} 
			
			public static void ModulesofTwoNumbers() {
				Scanner in = new Scanner(System.in);
				System.out.print("Input the first number : ");
				int a = in.nextInt();  
				System.out.print("Input the second number: ");
				int b = in.nextInt(); 
				int divided = a / b;
				int result = a - (divided * b);
				System.out.println(result); 
			}
			
			public static void ProductofBinary() {
				long binary1, binary2, multiply = 0;
				int digit, factor = 1;
				Scanner in = new Scanner(System.in);
				System.out.print("Input the first binary number: ");
				binary1 = in.nextLong();
				System.out.print("Input the second binary number: ");
				binary2 = in.nextLong();
				while (binary2 != 0)
				{
					digit = (int)(binary2 % 10);
					if (digit == 1)
					{
						binary1 = binary1 * factor;
						multiply = binaryproduct((int) binary1, (int) multiply);
					}
					else
					{
						binary1 = binary1 * factor;
					}
					binary2 = binary2 / 10;
					factor = 10;
				}
				System.out.print("Product of two binary numbers: " + multiply+"\n");
				}
			static int binaryproduct(int binary1, int binary2) 
			{
				int i = 0, remainder = 0;
				int[] sum = new int[20];
				int binary_prod_result = 0;
				
				while (binary1 != 0 || binary2 != 0) 
				{
					sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
					remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
					binary1 = binary1 / 10;
					binary2 = binary2 / 10;
				}
				if (remainder != 0)
				{
					sum[i++] = remainder;
				}
				--i;
				while (i >= 0) 
				{
					binary_prod_result = binary_prod_result * 10 + sum[i--];
				}
				return binary_prod_result;
				}
			
			
}

