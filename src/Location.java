/**
 * Location objects for present location of items
 * @author khing
 *
 */

import java.util.ArrayList;

public class Location {
	/**
	 * List of items at a location
	 */
	ArrayList<Object> items;
	/**
	 * Default constructor
	 */
	public Location() {
		this.items = new ArrayList<Object>(100);
	}
	/**
	 * Adds an item to the locations item list
	 * @param item
	 */
	public void addItem(Item item) {
		this.items.add(this.items.size(), item);
	}
}
