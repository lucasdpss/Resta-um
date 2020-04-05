
public class Tabuleiro {
	char m[][];
	
	Tabuleiro(){
		m = new char[7][7];
		for(int i=0;i < 7;i++) {
			for(int j=0;j < 7;j++) {
				if((i == 0 || i == 1 || i == 5 || i == 6)&&
				   (j == 0 || j == 1 || j == 5 || j == 6))
					m[i][j] = ' ';
				else
					m[i][j] = 'P';
			}
		}
		m[3][3] = '-';
	}
	
	void mostrar() {
		for(int i=0;i < 7;i++) {
			System.out.print(7-i+" ");
			for(int j=0;j < 7;j++) {
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g");
	}
}