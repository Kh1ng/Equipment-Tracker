import java.util.Scanner;

public class Menu {
	Scanner scan;
	
	public Menu() {
		scan = new Scanner(System.in);
		
	}
	/**
	 * Starting prompt
	 */
	public void start() {
		System.out.println("Inventory demo");
		System.out.println("Select an option:\n1. look up\n2. add\n3. Change Location");
		runMenu(getSelection(3));
	}
	/**
	 * Validates user input
	 * @param numItems number of menu choices
	 * @return the users menu choice if valid or -1
	 */
	public int getSelection(int numItems) {
		int selection = -1;
		do {
			System.out.print("Enter your choice: ");
			String input = scan.next();
			if((Integer.parseInt(input) <= numItems) && (Integer.parseInt(input) > 0)){
				selection = Integer.parseInt(input);
			}
			else {
				selection = -1;
				System.out.println("Please enter a valid selection 1 - " + numItems + ".");
			}
		} while(selection == -1);
		return selection;
	}
	/**
	 * runs the desired menu based on user selection
	 * @param selection
	 */
	public void runMenu(int selection) {
		switch (selection) {
		case 1: lookUp();
			break;
		case 2: addItem();
			break;
		case 3: changeLocation();
			break;	
		}
	}
	/**
	 * look up item
	 */
	public void lookUp() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * add new item
	 */
	private void addItem() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * change location
	 */
	private void changeLocation() {
		// TODO Auto-generated method stub
		
	}
}
