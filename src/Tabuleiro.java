
public class Tabuleiro {
	Bolinha m[][];
	
	Tabuleiro(){
		m = new Bolinha[7][7];
		for(int i=0;i < 7;i++) {
			for(int j=0;j < 7;j++) {
				if((i == 0 || i == 1 || i == 5 || i == 6)&&
				   (j == 0 || j == 1 || j == 5 || j == 6)) {
					m[i][j] = null;
				}else {
					Bolinha tmp = new Bolinha();
					m[i][j] = tmp;
				}
			}
		}
		m[3][3] = null;
	}
	
	void mostrar() {
		for(int i=0;i < 7;i++) {
			System.out.print(7-i+" ");
			for(int j=0;j < 7;j++) {
				if((i == 0 || i == 1 || i == 5 || i == 6)&&
				   (j == 0 || j == 1 || j == 5 || j == 6)) {
					System.out.print("  ");
				}else if(m[i][j] == null){
					System.out.print("- ");
				}else {
					System.out.print(m[i][j].ch+" ");
				}
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g");
		System.out.println();
	}
	
	void mover_peca(String s) {        //recebe uma string "f4:d4"
		int ii = '7' - s.charAt(1);    //i inicial
		int ji =  s.charAt(0) - 'a';   //j inicial
		int id = '7' - s.charAt(4);    //i destino
		int jd = s.charAt(3) - 'a';    //j destino
		
		if(mov_valido()) {
			m[(ii+id)/2][(ji+jd)/2] = null;
			m[id][jd] = m[ii][ji];
			m[ii][ji] = null;
		}
		
	}
	
	boolean mov_valido() {
		return true;
	}
}