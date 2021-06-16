import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;




public class AddressBookUC{
	Scanner read=new Scanner(System.in);
	Hashtable<String,String> store=new Hashtable<String,String>();
	
	public  List create() {
	   
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
	
	
     public void read(String name) throws FileNotFoundException {
    	
    	 
    		 Scanner sc = new Scanner(new File("test.csv"));  
    		 sc.useDelimiter(",");   //sets the delimiter pattern  
    		 while (sc.hasNext()) {
    		String[] firstn=sc.nextLine().split(",");
    		if (firstn[0].equals(name)){
    			System.out.println("The first name is :"+firstn[0]);
    			System.out.println("The last name is :"+firstn[1]);
    			System.out.println("The address  is :"+firstn[2]);
    			System.out.println("The city  is :"+firstn[3]);
    			System.out.println("The state  is :"+firstn[4]);
    			System.out.println("The zip  is :"+firstn[5]);
    			System.out.println("The phone is :"+firstn[6]);
    			System.out.println("The email address is "+firstn[7]);
    		
   
    		 
    		 } 
    	
    	 }
     }
     public void editmmode() throws FileNotFoundException{
    	 List<String> inputList = new ArrayList<String>();
    	 System.out.println("Enter the item to modify");
    	 String itr=read.nextLine();

    	    try{

    	      File inputF = new File("test.csv");
    	      InputStream inputFS = new FileInputStream(inputF);
    	      BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

    	      // skip the header of the csv
    	      Stream<String> lines = br.lines();
    	      List edit=lines.map(line -> Arrays.asList(line.split(",")))
    	      .collect(Collectors.toList());
    	   
    	      System.out.println(edit);
    	      
    	      //lines.filter(a -> a.matches(itr))
    	      //.collect(Collectors.toList());
    	    } catch (IOException e) {
    	    	
    	    System.out.println(e);
    	 
     }
     
     }
     
     
      
     public static void readDataLineByLine(String file)
 	{
 	  
 	    try {
 	  
 	        // Create an object of filereader
 	        // class with CSV file as a parameter.
 	        FileReader filereader = new FileReader(file);
 	  
 	        // create csvReader object passing
 	        // file reader as a parameter
 	        CSVReader csvReader = new CSVReader(filereader);
 	        String[] nextRecord;
 	  
 	        // we are going to read data line by line
 	        while ((nextRecord = csvReader.readNext()) != null) {
 	            for (String cell : nextRecord) {
 	                System.out.print(cell + "\t");
 	            }
 	            System.out.println();
 	        }
 	    }
 	    catch (Exception e) {
 	        e.printStackTrace();
 	    }
 	    
 	}
     
     public static void delete() throws IOException {
 		
 		Scanner sc=new Scanner(System.in);
 		System.out.println("\nenter the first name  to delete");
 		String name=sc.nextLine();
 		 FileReader filereader = new FileReader("C:\\Users\\prash\\eclipse-workspace\\AddressBookUC1\\test.csv");
 		 CSVReader read = new CSVReader(filereader);
 		 List<String[]> myEntries = read.readAll();
 		 List filtered = myEntries.stream()
                  .filter(entry -> !entry[0].equals(name))
                  .collect(Collectors.toList());
           FileWriter fw = new FileWriter("test.csv");
           CSVWriter writer = new CSVWriter(fw);
  		 writer.writeAll(filtered);
  		 writer.close();
          //CSVWriter w = new CSVWriter(fw);
         System.out.println("The values after deleting\n");
         AddressBookUC.readDataLineByLine("C:\\Users\\prash\\eclipse-workspace\\AddressBookUC1\\test.csv");
         System.out.printf("\nThe number of records in ADDRESS BOOK is :"+ filtered.size());
}
     
   
}

    	 
    	 
     
	
             
		
	
	
	
