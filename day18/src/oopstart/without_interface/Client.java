package oopstart.without_interface;

public class Client {
	// 메세지 센더 계열 객체를 받아서 .send() 실행
	public void process() {
		RealMessageSender messageSender = new RealMessageSender();
		// FakeMessageSender messageSender = new FakeMessageSender();
		
		messageSender.send();
	}
}
