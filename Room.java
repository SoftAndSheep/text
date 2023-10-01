import java.util.ArrayList;
import java.util.List;

public class Room {
	private String name;
	private String description;
	private List<Items> items;
	private Room north;
	private Room south;
	private Room west;
	private Room east;
	
	
	public Room (String name, String description) {
		this.name = name;
		this.description = description;
		this.items = new ArrayList<>();
		
	}
//getters and setters important to change stuff for game purposes
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	
	public void addItem(Items item) {
	    items.add(item);
	}

	public void removeItem(Items item) {
	    items.remove(item);
	}

	public boolean hasItem(String itemName) {
		for (Items item : items) {
            if (item.getName(item).equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
	}
	
	public void setNorth(Room northRoom) {
		this.north = northRoom;
	}
	public Room getNorth() {
		return north;
	}
	
	public void setSouth(Room southRoom) {
		this.south = southRoom;
	}
	public Room getSouth() {
		return south;
	}
	
	public void setWest(Room westRoom) {
		this.west = westRoom;
	}
	public Room getWest() {
		return west;
	}
	
	public void setEast(Room eastRoom) {
		this.east = eastRoom;
	}
	public Room getEast() {
		return east;
	}
}
