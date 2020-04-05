
public class Main {

	public static void main(String[] args) {
		CSVReader csv = new CSVReader();
		csv.setDataSource("src\\solution.csv");
		String commands[] = csv.requestCommands();
		
		Tabuleiro t = new Tabuleiro();
		
		
		for(int i=0;i < commands.length;i++)
			System.out.print(commands[i] + " ");
		
		t.mostrar();
		
	}

}
