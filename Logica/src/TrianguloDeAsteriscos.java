public class TrianguloDeAsteriscos {
	public static void main(String[] args) {
		int fim = Integer.parseInt(args[0]);
		for (int i = 1; i <= fim; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
