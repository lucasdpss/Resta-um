
public class Main {

	public static void main(String[] args) {
		CSVReader csv = new CSVReader();
		csv.setDataSource("src\\solution.csv");
		String commands[] = csv.requestCommands();
		
		System.out.println("OLAAAA");
		for(int i=0;i < commands.length;i++) {
			System.out.println(commands[i]);
		}
	}

}
