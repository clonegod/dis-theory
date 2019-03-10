package dis.theories.serialize03.json.fastjson;

import dis.theories.serialize.ISerializer;
import model.User;

public class TestFastJsonSerializer {

	public static void main(String[] args) {
		User user = new User();
		user.setAge(10);
		user.setName("alice");
		
		ISerializer serializer = new FastjsonSerializer();
		byte[] bytes = serializer.serialize(user);
		System.out.println(new String(bytes));
		
		User user2 = serializer.deSerialize(bytes, User.class);
		System.out.println(user2);
	}
}
