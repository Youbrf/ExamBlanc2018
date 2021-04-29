/**
 * 
 */
package index;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author YCH
 *
 */
class MeetingTest {

	Meeting meet = new Meeting("Java - ICC","2021-05-17", "Lemonnier");
	ArrayList<Participant> arpart = new ArrayList<>();
	Participant part = new Participant("Timon", "Pumba", "normal");
	Participant part1 = new Participant("Tintin", "Milou", "vip");
	Participant part2 = new Participant("Tic", "Tac", "normal");
	Participant part3 = new Participant("Tomy", "Jerry", "vip");
	
	@Test
	void testConstructeur() {
		arpart.add(part);
		arpart.add(part1);
		arpart.add(part2);
		arpart.add(part3);
		
		meet.getParticipants().add(part);
		meet.getParticipants().add(part1);
		meet.getParticipants().add(part2);
		meet.getParticipants().add(part3);
		
		assertEquals("Java - ICC", meet.getTexte());
		assertEquals(LocalDate.parse("2021-05-17"), meet.getDateEvent());
		assertEquals("Lemonnier", meet.getLieu());
		assertEquals(arpart,meet.getParticipants());
		
	}
	
	@Test
	void testGetVip() {
		arpart.add(part1);
		arpart.add(part3);
		
		meet.getParticipants().add(part);
		meet.getParticipants().add(part1);
		meet.getParticipants().add(part2);
		meet.getParticipants().add(part3);
		
		assertEquals(arpart, meet.getVIP());
	}
	
	@Test
	void testDropGuest() {
		arpart.add(part);
		arpart.add(part1);
		arpart.add(part3);
		
		meet.getParticipants().add(part);
		meet.getParticipants().add(part1);
		meet.getParticipants().add(part2);
		meet.getParticipants().add(part3);
		
		assertEquals(true, meet.dropGuest(part2));
	}
	
	@Test
	void testDropGuest1() {
		arpart.add(part);
		arpart.add(part1);
		arpart.add(part3);
		
		meet.getParticipants().add(part);
		meet.getParticipants().add(part1);
		meet.getParticipants().add(part2);
		meet.getParticipants().add(part3);
		
		meet.dropGuest(part2);
		
		assertEquals(arpart, meet.getParticipants());
	}
	
	@Test
	void testHasGuest() {
		meet.getParticipants().add(part);
		meet.getParticipants().add(part1);
		meet.getParticipants().add(part2);
		meet.getParticipants().add(part3);	
		
		assertEquals(true, meet.hasGuest(part2));
	}
	
	@Test
	void testToString() {
		meet.getParticipants().add(part);
		meet.getParticipants().add(part1);
		meet.getParticipants().add(part2);
		meet.getParticipants().add(part3);
		
		String result = "Meeting "
				+ "\nlieu= " + meet.getLieu()
				+ ", \ntexte = " + meet.getTexte()
				+ ", \ndate = " + meet.getDateEvent() 
				+ ", \nparticipants = \n" + meet.getParticipants();
		
		assertEquals(result, meet.toString());
	}

}
