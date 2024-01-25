package oopstart.with_interface;

import oopstart.without_interface.RealMessageSender;

public class Client {
		public void process() {
		RealMessageSender messageSender = new RealMessageSender();
		// FakeMessageSender messageSender = new FakeMessageSender();
		
		messageSender.send();
	}
}
