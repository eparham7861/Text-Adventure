package ecp.prj;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class RoomMapTest {
	
	@Test
	public void testSetPath() {
		RoomMap currentMap = new RoomMap();
		currentMap.setPath(RoomMap.Pathway.NORTH, "Kitchen");
		assertEquals("Kitchen", currentMap.getPathwayRoom(RoomMap.Pathway.NORTH));
	}
	
	@Test
	public void testGetAvailableMoves() {
		RoomMap currentMap = new RoomMap();
		currentMap.setPath(RoomMap.Pathway.NORTH, "Kitchen");
		currentMap.setPath(RoomMap.Pathway.SOUTH, "Dining Room");
		assertEquals(2, currentMap.getAvailableMoves());
	}
}