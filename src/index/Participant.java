/**
 * 
 */
package index;

/**
 * @author YCH
 *
 */
public class Participant extends Person {
	/**
	 * Constructeur de Participant
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 * @param statut statut de la personne
	 */
	public Participant(String nom, String prenom, String statut) {
		super(nom, prenom, statut);
	}
	
	/**
	 * La méthode renvoye la première lettre du nom suivie de la première lettre du prénom.
	 */
	@Override
	public String getInitials() {
		StringBuffer sb = new StringBuffer();
		sb.append(getNom().charAt(0));
		sb.append(getPrenom().charAt(0));
		String initial = sb.toString();
		return initial;
	}

	/**
	 * affiche l'initial de la personne et le status
	 */
	@Override
	public String toString() {
		return "[Initial= " + getInitials() + ", statut= " + getStatut() + "]\n";
	}

	
}
