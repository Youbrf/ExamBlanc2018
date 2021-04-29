package index;
/**
 * Interface Manageable
 * @author YCH
 *
 */
public interface Manageable {
	/**
	 * Methode qui supprime un participant du meeting
	 * @param p participant � supprim�
	 * @return retourne vrai si la personne a �t� supprim� sinon faux
	 */
	public boolean dropGuest(Participant p);
	/**
	 * Methode qui verifie si le participant est dans le meeting
	 * @param p participant a recherch�
	 * @return retourne vrai si le participant est dans le meeting sinon faux
	 */
	public boolean hasGuest(Participant p);
}
