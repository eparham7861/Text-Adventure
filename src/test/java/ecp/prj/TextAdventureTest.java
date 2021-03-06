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
	public void testSetInvalidStartingRoom() {
		newGame.setStartingRoom("Hallway");
	}
	
	@Test
	public void testSetRoomAvailableMoves() {
		newGame.appendRoom("Hallway");
		newGame.appendRoom("Dining Room");
		newGame.appendRoom("Kitchen");
		newGame.appendRoom("Living Room");
		newGame.appendRoom("Closet");
		
		newGame.setRoomNorthMove("Hallway", "Dining Room");
		newGame.setRoomSouthMove("Hallway", "Kitchen");
		newGame.setRoomEastMove("Hallway", "Living Room");
		newGame.setRoomWestMove("Hallway", "Closet");
		
		assertEquals(4, newGame.getAvailableMoves("Hallway"));
	}
	
	@Test
	public void testSetInvalidRoomMoveNorth() {
		newGame.appendRoom("Dining Room");
		newGame.setRoomNorthMove("Hallway", "Dining Room");
	}
	
	@Test
	public void testSetInvalidPathNorth() {
		newGame.appendRoom("Hallway");
		newGame.setRoomNorthMove("Hallway", "Dining Room");
	}
	@Test
	public void testAttemptGetMovesForRoomThatDoesNotExist() {
		assertEquals(0, newGame.getAvailableMoves("Hallway"));
	}
}