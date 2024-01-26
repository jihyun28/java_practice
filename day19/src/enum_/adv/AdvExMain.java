package enum_.adv;

public class AdvExMain {

	public static void main(String[] args) {
		// 클라이언트가 요청할 때 calculateCommand 객체가 제공한 데이터를 사용
		CalculateCommand calculateCommand = new CalculateCommand(CalculateType.ADD,100,3);
		Client client = new Client();
		int result = client.process(calculateCommand);
		
		System.out.println(result);
	}
}