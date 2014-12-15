package ecp.prj;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TextAdventureRoomTest {
	
	@Test
	public void testNewRoom() {
		TextAdventureRoom newRoom = new TextAdventureRoom("Hallway");
		assertEquals("Hallway", newRoom.getRoomName());
	}
	
	@Test
	public void testAddPath() {
		TextAdventureRoom newRoom = new TextAdventureRoom("Hallway");
		newRoom.addPath(RoomMap.Pathway.NORTH, "Kitchen");
		assertEquals("Kitchen", newRoom.getPathwayRoom(RoomMap.Pathway.NORTH));
	}
	
	@Test
	public void testAddMultiplePaths() {
		TextAdventureRoom newRoom = new TextAdventureRoom("Hallway");
		newRoom.addPath(RoomMap.Pathway.NORTH, "Kitchen");
		newRoom.addPath(RoomMap.Pathway.SOUTH, "Dining Room");
		assertEquals("Kitchen", newRoom.getPathwayRoom(RoomMap.Pathway.NORTH));
		assertEquals("Dining Room", newRoom.getPathwayRoom(RoomMap.Pathway.SOUTH));
	}
	
	@Test
	public void testGetAvailableMoves() {
		TextAdventureRoom newRoom = new TextAdventureRoom("Hallway");
		newRoom.addPath(RoomMap.Pathway.NORTH, "Kitchen");
		newRoom.addPath(RoomMap.Pathway.SOUTH, "Dining Room");
		assertEquals(2, newRoom.getAvailableMoves());
	}
}