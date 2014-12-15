package ecp.prj;

public class TextAdventureRoom {
	
	private String roomName;
	private RoomMap currentMap;
	
	public TextAdventureRoom (String roomName) {
		this.roomName = roomName;
		currentMap = new RoomMap();
	}
	
	public String getRoomName() {
		return roomName;
	}
	
	public void addPath(RoomMap.Pathway direction, String roomName) {
		currentMap.setPath(direction, roomName);
	}
	
	public String getPathwayRoom(RoomMap.Pathway direction) {
		return currentMap.getPathwayRoom(direction);
	}
	
	public int getAvailableMoves() {
		return currentMap.getAvailableMoves();
	}
}