public class TriangulosDeAsteriscos {
	public static void main(String[] args) {
		int fim = Integer.parseInt(args[0]);
		int qtd = Integer.parseInt(args[1]);
		for (int a = 1; a <= qtd; a++) {
			for (int i = 1; i <= fim; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
	}
}