/**
 * 
 */
package index;

import java.util.ArrayList;

/**
 * @author YCH
 *
 */
public class Journal {
	/**
	 * liste des evenement
	 */
	private ArrayList<Evenement> event;

	/**
	 * 
	 * @return retourne la liste des evenements
	 */
	public ArrayList<Evenement> getEvent() {
		return event;
	}
	/**
	 * modifie la liste des evenements
	 * @param event
	 */
	public void setEvent(ArrayList<Evenement> event) {
		this.event = event;
	}

	/**
	 * Constructeur du journal 
	 * @param event la liste des evenement 
	 */
	public Journal(ArrayList<Evenement> event) {
		super();
		this.event = event;
	}

	
	/**
	 * toString du journal 
	 * affiche la liste des evenements
	 */
	@Override
	public String toString() {
		return "Journal [event=" + event + "]";
	}

	
}
