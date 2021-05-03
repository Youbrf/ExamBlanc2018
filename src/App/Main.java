/**
 * 
 */
package App;

import Utility.Utilities;
import index.Meeting;
import index.Participant;

/**
 * @author YCH
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Désérialisation
		 */
		Meeting meet; 
		
		meet = Utilities.fromXml("Meeting.xml");
		
		System.out.println(meet);
		
		
		/*
		 * Serialisation
		 */
//		Meeting meet = new Meeting("Java - ICC","2021-05-17", "Lemonnier");
//		
//		Participant part = new Participant("Timon", "Pumba", "normal");
//		Participant part1 = new Participant("Tintin", "Milou", "vip");
//		Participant part2 = new Participant("Tic", "Tac", "normal");
//		Participant part3 = new Participant("Tomy", "Jerry", "vip");
//		
//		meet.getParticipants().add(part);
//		meet.getParticipants().add(part1);
//		meet.getParticipants().add(part2);
//		meet.getParticipants().add(part3);
//		
//		Utilities.toXMLFile(meet, "Meeting.xml");
		
		
	}

}
