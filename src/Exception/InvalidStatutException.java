/**
 * 
 */
package Exception;

/**
 * @author YCH
 *
 */
public class InvalidStatutException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1268541001165075723L;

	public InvalidStatutException() {
		super("Error , Le statut - normal ou vip");
	}
}