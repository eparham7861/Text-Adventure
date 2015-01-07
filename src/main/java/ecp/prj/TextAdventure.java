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
		else {
			System.out.println("I need an exception");
		}
	}
	
	public String getStartingRoom() {
		return currentRoom;
	}
	
	public void setRoomNorthMove(String currentRoom, String pathWayRoom) {
		if (building.containsKey(currentRoom) && building.containsKey(pathWayRoom)) {
			building.get(currentRoom).addPath(RoomMap.Pathway.NORTH, pathWayRoom);
		}
		else {
			System.out.println("I need an exception");
		}
	}
	
	public void setRoomSouthMove(String currentRoom, String pathWayRoom) {
		if (building.containsKey(currentRoom) && building.containsKey(pathWayRoom)) {
			building.get(currentRoom).addPath(RoomMap.Pathway.SOUTH, pathWayRoom);
		}
		else {
			System.out.println("I need an exception");
		}
	}
	
	public void setRoomEastMove(String currentRoom, String pathWayRoom) {
		if (building.containsKey(currentRoom) && building.containsKey(pathWayRoom)) {
			building.get(currentRoom).addPath(RoomMap.Pathway.EAST, pathWayRoom);
		}
		else {
			System.out.println("I need an exception");
		}
	}
	
	public void setRoomWestMove(String currentRoom, String pathWayRoom) {
		if (building.containsKey(currentRoom) && building.containsKey(pathWayRoom)) {
			building.get(currentRoom).addPath(RoomMap.Pathway.WEST, pathWayRoom);
		}
		else {
			System.out.println("I need an exception");
		}
	}
	
	public int getAvailableMoves(String currentRoom) {
		if (building.containsKey(currentRoom)) {
			return building.get(currentRoom).getAvailableMoves();
		}
		else {
			return 0;
		}
	}
}