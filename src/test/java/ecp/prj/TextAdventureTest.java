package ecp.prj;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TextAdventureTest {
	
	private TextAdventure newGame;
	@Before
	public void StartUp() {
		newGame = new TextAdventure();
	}
	@Test
	public void testStartNewGame() {
		newGame.appendRoom("Hallway");
		assertEquals("Hallway", newGame.getRoomName(0));
	}
	
	@Test
	public void testGetSecondRoom() {
		newGame.appendRoom("Hallway");
		newGame.appendRoom("Dining Room");
		assertEquals("Dining Room", newGame.getRoomName(1));
	}
	
	@Test
	public void testGetNoRoom() {
		assertEquals("No rooms in game yet.", newGame.getRoomName(5));
	}
	
	@Test
	public void testSetStartingRoom() {
		newGame.appendRoom("Hallway");
		newGame.appendRoom("Dining Room");
		newGame.appendRoom("Kitchen");
		newGame.setStartingRoom("Hallway");	
		assertEquals("Hallway", newGame.getStartingRoom());
	}
	
	@Test
	public void testSetRoomAvailableMoves() {
		newGame.appendRoom("Hallway");
		newGame.appendRoom("Dining Room");
		newGame.appendRoom("Kitchen");
		newGame.appendRoom("Living Room");
		
		newGame.setRoomMove("Hallway", RoomMap.Pathway.NORTH, "Dining Room");
		newGame.setRoomMove("Hallway", RoomMap.Pathway.SOUTH, "Kitchen");
		newGame.setRoomMove("Hallway", RoomMap.Pathway.EAST, "Living Room");
		
		assertEquals(3, newGame.getAvailableMoves("Hallway"));
	}
	@Test
	public void testGetAvailableMoves() {
		newGame.appendRoom("Hallway");
		newGame.appendRoom("Dining Room");
		newGame.appendRoom("Kitchen");
		newGame.setStartingRoom("Hallway");
	}
}