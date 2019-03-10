package dis.theories.serialize02.xml;

import dis.theories.serialize.ISerializer;
import model.User;

public class TestXMLSerializer {
	
	public static void main(String[] args) {
		User user = new User();
		user.setAge(10);
		user.setName("alice");
		
		ISerializer serializer = new XMLSerializer();
		byte[] bytes = serializer.serialize(user);
		System.out.println(new String(bytes));
		
		User user2 = serializer.deSerialize(bytes, User.class);
		System.out.println(user2);
	}
}
