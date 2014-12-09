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
	
}