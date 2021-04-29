/**
 * 
 */
package index;

import java.util.ArrayList;

/**
 * @author YCH
 * Meeting est la classe fille de Evenement et implémente Manageable
 */
public class Meeting extends Evenement implements Manageable{
	/**
	 * lieu du meeting
	 */
	private String lieu;
	/**
	 * liste de participant
	 */
	private ArrayList<Participant> participants;
	
	/**
	 * 
	 * @return retourne le lieu du meeting
	 */
	public String getLieu() {
		return lieu;
	}
	/**
	 * modifie le lieu du meeting
	 * @param lieu lieu du meeting
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	/**
	 * 
	 * @return retourne la liste des participant
	 */
	public ArrayList<Participant> getParticipants() {
		return participants;
	}
	/**
	 * modifie la liste des participant
	 * @param participants liste de participants
	 */
	public void setParticipants(ArrayList<Participant> participants) {
		this.participants = participants;
	}
	
	/**
	 * Constructeur du meeting
	 * @param event liste des evenement
	 * @param texte texte de l'evenement
	 * @param dateEvent date de l'evenement
	 * @param lieu lieu du meeting
	 * @param participants liste des participants
	 */
	public Meeting(String texte, String dateEvent, String lieu) {
		super(texte, dateEvent);
		this.lieu = lieu;
		this.participants = new ArrayList<Participant>();
	}
	
	/**
	 * 
	 * @return retourne la liste des participants vip
	 */
	public ArrayList<Participant> getVIP() {
		ArrayList<Participant> vip = new ArrayList<>();
		for (Participant vipPart : participants) {
			if(vipPart.getStatut()=="vip") {
				vip.add(vipPart);
			}
		}
		return vip;
	}
	/**
	 * Qui permet de supprimer un participant du meeting
	 */
	@Override
	public boolean dropGuest(Participant p) {
		for (Participant drop : participants) {
			if(drop.getNom()==p.getNom() && drop.getPrenom()==p.getPrenom()) {
				this.participants.remove(drop);
				return true;
			}
		}
		return false;
	}
	/**
	 * Qui permet de savoir si un participant est dans le meeting ou pas
	 */
	@Override
	public boolean hasGuest(Participant p) {
		for (Participant has : participants) {
			if(has.getNom()==p.getNom() && has.getPrenom()==p.getPrenom()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * toString du meeting
	 */
	@Override
	public String toString() {
		return "Meeting "
				+ "\nlieu= " + lieu
				+ ", \ntexte = " + getTexte()
				+ ", \ndate = " + getDateEvent() 
				+ ", \nparticipants = \n" + participants;
	}
}
