package Com;
import java.util.Scanner;

public class OddAndEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
												
		System.out.print("Enter start number: ");
		int start = scanner.nextInt();
		System.out.print("Enter end number: ");
		int end = scanner.nextInt(); 
		System.out.println("All numbers from " + start + " to " + end + ":");
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); 
							
		System.out.println("Even numbers from " + start + " to " + end + ":");
		int[] evenarray = new int[100];
		int evenIndex = 0; 
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				evenarray[evenIndex++] = i; 
			}
		}
		System.out.println(); 
		System.out.println("Odd numbers from " + start + " to " + end + ":");
		int[] oddarray = new int[100];
		int oddIndex = 0; 
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				oddarray[oddIndex++] = i; 
			}
		}
		System.out.println(); 
		System.out.print("Even number array: ");
		for (int i = 0; i < evenIndex; i++) {
			System.out.print(evenarray[i] + " ");
			
		}
		System.out.println();
		System.out.print("Odd number array: ");
		for (int i = 0; i < oddIndex; i++) {
			System.out.print(oddarray[i] + " ");
		}
		System.out.println();
	}
}
	
	
