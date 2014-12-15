import ecp.prj.*;

public class TextAdventureKeywords {
	private TextAdventure newGame;
	
	public void StartNewGame() {
		newGame = new TextAdventure();
	}
	
	public void appendGameRoom(String newRoom) {
		newGame.appendRoom(newRoom);
	}
	
	public String GetRoom (int roomIndex) {
		return newGame.getRoomName(roomIndex);
	}
}