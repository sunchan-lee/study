package collection.list;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	public String command;
	public String to;

	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}

}

public class QueueTest {

	public static void main(String[] args) {
		// Queue 구조는 LinkedList 이다.
		Queue<Message> queue = new LinkedList<>();

		queue.offer(new Message("sendMail", "그린"));
		queue.offer(new Message("sendSMS", "학생"));
		queue.offer(new Message("sendkakao", "스프링"));
		
		while(!queue.isEmpty()) {
			Message message=queue.poll();
			
			switch (message.command) {
			
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to+"님에게 SMS을 보냅니다.");
				break;
			case "sendkakao":
				System.out.println(message.to+"님에게 카톡을 보냅니다.");
				break;
				
			default:
				break;
			}
			
			
		}

	}

}
