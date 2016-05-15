public class TrianguloDeAsteriscos2 {
	public static void main(String[] args) {
		int fim = Integer.parseInt(args[0]);
		String aux = "*";
		for (int i = 1; i <= fim; i++) {
			System.out.println(aux);
			aux += "*";
		}
		String aux2 = "*";
		for (int i = 1; i <= fim; i++, aux2 += "*") {
			System.out.println(aux2);
		}
		String aux3 = "*********************************************************************************************";
		for (int i = 1; i <= fim; i++) {
			System.out.println(aux3.substring(0, i));
		}
		for (int i = 1; i <= fim; i++) {
			System.out.println(new String(new char[i]).replace("\0", "*"));
		}
	}
}
