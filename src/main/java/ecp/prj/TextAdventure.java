package ecp.prj;

import java.util.*;

public class TextAdventure {
	
	private Map<String, TextAdventureRoom> building;
	private String currentRoom;
	
	public TextAdventure() {
		building = new LinkedHashMap<String, TextAdventureRoom>();
		currentRoom = "";
	}
	
	public void appendRoom(String newRoom) {
		building.put(newRoom, new TextAdventureRoom(newRoom));
	}
	
	public String getRoomName(int index) {
		
		Iterator<String> keySet = building.keySet().iterator();
		String currentRoomName = "";
		
		if (keySet.hasNext()) {
			for (int i = 0; i <= index; i++) {
				currentRoomName = building.get(keySet.next()).getRoomName();
			}
		}
		else {
			currentRoomName = "No rooms in game yet.";
		}
		return currentRoomName;
	}
	
	public void setStartingRoom(String currentRoom) {
		if (building.containsKey(currentRoom)) {
			this.currentRoom = currentRoom;
		}
	}
	
	public String getStartingRoom() {
		return currentRoom;
	}
}