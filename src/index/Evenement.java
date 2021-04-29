/**
 * 
 */
package index;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

import Exception.PastDateException;

/**
 * @author YCH
 *
 */
public class Evenement {
	/**
	 * texte de l'evenement
	 */
	private String texte;
	/**
	 * date de l'evenement
	 */
	private LocalDate dateEvent;
	
	/**
	 * 
	 * @return le texte de l'evenement
	 */
	public String getTexte() {
		return texte;
	}
	/**
	 * Modifie le texte de l'evenement
	 * @param texte 
	 */
	public void setTexte(String texte) {
		this.texte = texte;
	}
	/**
	 * 
	 * @return la date l'evenement
	 */
	public LocalDate getDateEvent() {
		return dateEvent;
	}
	/**
	 * modifie la date de l'évenement
	 * @param dateEvent date de l'evenement
	 * @throws PastDateException l'exception au cas ou la date est passé
	 */
	public void setDateEvent(String dateEvent) throws PastDateException{
		LocalDate dateEv = LocalDate.parse(dateEvent);
		long date = DAYS.between(LocalDate.now(),dateEv);
		if(date<0) {
			throw new PastDateException();
		}else {
			this.dateEvent = dateEv;
		}
		
	}
	
	
	/**
	 * 
	 * @param texte texte de l'evenement
	 * @param dateEvent date de l'evenement 
	 */
	public Evenement(String texte, String dateEvent) {
		super();
		this.texte = texte;
		setDateEvent(dateEvent);
	}
	
	/**
	 * toString de l'evenement 
	 * Affiche le texte et la date de l'evenement
	 */
	@Override
	public String toString() {
		return "Evenement [texte=" + texte + ", dateEvent=" + dateEvent + "]";
	}
	
	
}
