package enum_.basic;

public class BasicEnumExMain {
	
	public static void main(String[] args) {
		CalculateCommand calculateCommand = new CalculateCommand(CalculateType.ADD, 100, 3);
		Client client = new Client();
		int result = client.process(calculateCommand);
		System.out.println(result);
	}
}