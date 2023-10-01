import java.util.ArrayList;

public class Player {
	private Room currentRoom;
	private ArrayList<String> inventory;
	String Item;
	
public Player(Room starterRoom) {
	currentRoom = starterRoom;
	inventory = new ArrayList<>();
	//array for the inventory
}


public Room getCurrentRoom() {
	return currentRoom;
}
public void setCurrentRoom(Room newRoom) {
	currentRoom = newRoom;
}

public void AddToInventory() {
	inventory.add(Item);
}
public void RemoveFromInventory() {
	inventory.remove(Item);
}
	
}
