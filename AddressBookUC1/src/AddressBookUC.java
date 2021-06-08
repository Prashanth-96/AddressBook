import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class AddressBookUC{
	Scanner read=new Scanner(System.in);
	Hashtable<String,String> store=new Hashtable<String,String>();
	int option=read.nextInt();
	public  List create() {
	    if (option == 1)
	    {
	    Scanner lp=new Scanner(System.in);	
		System.out.println("Enter your first name");
		String fname=lp.nextLine();
	    System.out.println("Enter your Last name");
	    String lname=lp.nextLine();
	    System.out.println("Enter your address");
	    String add=lp.nextLine();
	    System.out.println("Enter your city ");
	    String city=lp.nextLine();
	    System.out.println("Enter your state");
	    String state=lp.nextLine();
	    System.out.println("Enter your zip code");
	    String zip=lp.nextLine();
	    System.out.println("Enter your phone number");
	    String phone=lp.nextLine();
	    System.out.println("Enter your email address");
	    String email=lp.nextLine();
		return  Arrays.asList(fname,lname,add,city,state,zip,phone,email);
		}
		return null;
	
}
	public void store() {
		if (option == 2) {
			
			Scanner st=new Scanner(System.in);
			System.out.println("Enter your first name");
			String fname=st.nextLine();
			store.put("fname", fname);
			System.out.println("Enter your Last name");
			String lname=st.nextLine();
			store.put("lname", lname);
			System.out.println("Enter your address");
			String add=st.nextLine();
			store.put("address",add);
			System.out.println("Enter your city");
			String city=st.nextLine();
			store.put("city", city);
			System.out.println("Enter your state");
			String state=st.nextLine();
			store.put("state", state);
			System.out.println("Enter your zip");
			String zip=st.nextLine();
			store.put("zip", zip);
			System.out.println("Enter your phone number");
			String phone=st.nextLine();
			store.put("phone", phone);
			System.out.println("Enter your email");
			String email=st.nextLine();
			store.put("email", email);
			System.out.println("Saved successfully");
			System.out.println(store.get("fname"));
			int size=store.size();
			System.out.println("The size of dictionary is"+size);
			
			
				}
	}
	
	public void database(List info) throws IOException{

		try {
		 FileWriter writer = new FileWriter("test.csv", true);
		     
		 writer.append((CharSequence) info.get(0));
		 writer.append(',');
		 writer.append((CharSequence) info.get(1));
		 writer.append(',');
		 writer.append((CharSequence) info.get(2));
		 writer.append(',');
		 writer.append((CharSequence) info.get(3));
		 writer.append(',');
		     writer.append((CharSequence) info.get(4));
		     writer.append(',');
		     writer.append((CharSequence) info.get(5));
		     writer.append(',');
		     writer.append((CharSequence) info.get(6));
		     writer.append(',');
		     writer.append((CharSequence) info.get(7));
		     writer.append(',');
		     writer.append('\n');
		     writer.flush();
		         writer.close();
		         System.out.println("Saved!");
		   } catch (FileNotFoundException e) {
		     System.out.println(e.getMessage());
		   }

		}
	}

	
             
		
	
	
	
