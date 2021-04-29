/**
 * 
 */
package Exception;

/**
 * @author YCH
 *
 */
public class PastDateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1282335347348408220L;

	public PastDateException() {
		super("La date est déjà passé , veuillez introduire une date dans le futur");
		// TODO Auto-generated constructor stub
	}
	
	

}
