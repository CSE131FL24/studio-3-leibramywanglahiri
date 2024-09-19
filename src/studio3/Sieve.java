package studio3;

import java.util.*;

public class Sieve {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	Boolean[] prime = new Boolean[n+1];
	for (int i = 0; i < prime.length; i++) {
		prime[i] = true;
	
	}
	
	for (int i = 2; i <= (int) Math.sqrt(n); i++) {
		if (prime[i]) {
			for (int j = (int) Math.pow(i,  2); j <= n; j+=i) {
				prime[j] = false;
			}
		}
	}
	for (int i = 2; i < prime.length; i++) {
		if (prime[i]) {
			System.out.println(i);
		}
	}

	}
	
	
	
}
