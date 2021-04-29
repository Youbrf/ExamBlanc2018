/**
 * 
 */
package index;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Exception.InvalidStatutException;

/**
 * @author YCH
 *
 */
class PersonTest {

	Person pers = new Participant("Timon", "Pumba", "normal");
	
	@Test
	public void testconstructeur() {
		assertEquals("Timon", pers.getNom());
		assertEquals("Pumba", pers.getPrenom());
		assertEquals("normal", pers.getStatut());
	}
	
	@Test
	public void testGetStatus() {
		pers.setStatut("vip");
		assertEquals("vip", pers.getStatut());
	}

	@Test
	void testInvalidStatutException() {
		assertThrows(InvalidStatutException.class, () -> {
			Person pers = new Participant("Timon", "Pumba", "error");
		});
	}
}
