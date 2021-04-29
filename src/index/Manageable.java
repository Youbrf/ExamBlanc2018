package index;
/**
 * Interface Manageable
 * @author YCH
 *
 */
public interface Manageable {
	/**
	 * Methode qui supprime un participant du meeting
	 * @param p participant à supprimé
	 * @return retourne vrai si la personne a été supprimé sinon faux
	 */
	public boolean dropGuest(Participant p);
	/**
	 * Methode qui verifie si le participant est dans le meeting
	 * @param p participant a recherché
	 * @return retourne vrai si le participant est dans le meeting sinon faux
	 */
	public boolean hasGuest(Participant p);
}
