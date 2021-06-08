import java.io.IOException;
import java.util.*;
public class AddressBook{
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Address Book");
		//System.out.println("PRESS \n1. TO CREATE\n2. TO VIEW ADDRESS BOOK ENTRY\n3.TO EDIT CHANGES\n4.DELETE PARTICULAR RECORD");
		AddressBookUC entry=new AddressBookUC();
		List<String> input = entry.create();
		entry.store();
		//entry.show();
		//entry.database(input);
		/*System.out.println(input.get(0));
		System.out.println(input.get(1));
		System.out.println(input.get(2));
		System.out.println(input.get(3));
		System.out.println(input.get(4));
		System.out.println(input.get(5));
		System.out.println(input.get(6));
		System.out.println(input.get(7));*/
	
		
	}
}