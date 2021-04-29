/**
 * 
 */
package App;

import index.Participant;
import index.Person;

/**
 * @author YCH
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person pers = new Participant("Timon", "Pumba", "normal");
		
		System.out.println(pers.getInitials());
		
		
	}

}
