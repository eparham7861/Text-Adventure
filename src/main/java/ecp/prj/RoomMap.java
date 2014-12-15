package ecp.prj;

import java.util.*;

public class RoomMap {
	
	public enum Pathway{NORTH, SOUTH, EAST, WEST}
	private Map<Pathway, String> currentMap;
	
	public RoomMap() {
		currentMap = new LinkedHashMap<Pathway, String>();
	}
	
	public void setPath(Pathway direction, String roomName) {
		currentMap.put(direction, roomName);
	}
	public String getPathwayRoom(Pathway direction) {
		if (currentMap.containsKey(direction)) {
			return currentMap.get(direction);
		}
		else {
			return "Room Not Found";
		}
	}
	
	public int getAvailableMoves() {
		return currentMap.size();
	}
}