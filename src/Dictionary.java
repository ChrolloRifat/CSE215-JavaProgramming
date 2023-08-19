import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
	/* Make a phoneBook to add phone numbers of friends
	 * with their names on a single line. Then ask to query 
	 * for a friend's number by inputting their name. If name
	 * is not present, display not found. Otherwise, print the 
	 * phone number alongside the name. Ask for queries until there
	 * are no more inputs.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> phoneBook = new HashMap<String, Integer>(); // (key, value) pairs
		System.out.println("How many entries you want to input?");
		int total = scan.nextInt();
		System.out.println("Enter name and phone number separated by a space");
		for(int i = 0; i < total; i++) {
			String name = scan.next();
			int num = scan.nextInt();
			phoneBook.put(name, num); // input (key, value) pairs
		}
		System.out.println("Search a phone number by name:");
		
		while(scan.hasNext()) {
			String name = scan.next();
			if(phoneBook.containsKey(name)) {  // containsKey method returns true if the map<key, value> has a certain key 
				System.out.println(name + "="+ phoneBook.get(name));  // get method gets the value of the key
			}
			else {
				System.out.println("Not Found");
			}
		}	
		scan.close();
	}

}
