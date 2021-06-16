import java.io.IOException;
import java.util.*;
public class AddressBook{
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Address Book");
		int wish=1;       //wish is initiated to make the program as per the choice of user, 1 to continue other operations,
		                 //0 to exit from AddressBook ,in short it used for continuity purpose.
			
		while(wish==1) {
			System.out.println("PRESS \n1. TO CREATE \n2.TO READ \n3. TO UPDATE \n4. TO DELETE");
			AddressBookUC entry=new AddressBookUC();
			Scanner pass=new Scanner(System.in);
			int option= pass.nextInt(); //Option is variable where the user enters the necessary operation to perform.
			
			 if (option == 1)    //Creates a new entry
			 {   
			List<String> input = entry.create();	 
			entry.database(input);
			 }
			 
			 else if (option==2) //To search and read from addressbook based on firstname
			 {
			System.out.println("Enter the firstname  to search");
			String name=pass.next();
		    entry.read(name);
			}
			 
			 
			 else if(option ==3) //To edit
			 {
				 entry.editmmode();
			 }
			 
			 
			 
			 else if (option == 4) //To delete
			 {
				 System.out.println("\nYou have selected delete mode");
				 entry.delete();
			 }
			 
			 
			 
			 
			 System.out.println("\nDo you want to continue?"
						+ "\n 1 to continue "
						+ "\n 0 to Exit");
				System.out.println("Please enter your choice: ");
				wish =pass.nextInt();
				if (wish==0) System.out.println("Thanks for using Address Book..!");
		 }
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