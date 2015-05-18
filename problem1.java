import java.util.*;

public class problem1 {

	public static void main(String[] args) {
		System.out.println(multi_of_3_5(1000));
		System.out.println(even_fib_num(4000000));
		System.out.println(largest_prime_factor(600851475143L));
	}

	// Find the sum of every multiple of 3 and 5 less than max	
	public static int multi_of_3_5(int max) {
		int sum = 0;
		for (int i = 0; i < max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	// Find the sum of even numbers in the Fibonacci sequence less than max
	public static int even_fib_num(int max) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		int i = l.get(0) + l.get(1);
		int sum = 2;
		while (i < max) {
			l.add(i);
			if (i % 2 ==0) {
				sum += i;
			}
			i = l.get(l.size() - 1) + l.get(l.size() - 2);
		}
		return sum;
	}
	
	// Find the largest prime factor of a number
	public static long largest_prime_factor(long num) {
		int i = 2;
		while (i * i <= num) {
			if (num % i != 0) {
				i += 1;
			} else {
				num /= i;
			}
		}
		return num;
	}
}
