public class Fibonacci {
	public static void main(String[] args) {
		int n1 = 0;
		System.out.print(n1);
		int n2 = 1;
		System.out.print(", " + n2);
		for (int i = 1; i <= 28; i++) {
			int soma = n1 + n2;
			System.out.print(", " + soma);
			n1 = n2;
			n2 = soma;
		}
	}
}
