import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kissi on 02/01/18.
 */
public class DispositifArriveeTest {
    @Test
    public void getNombreDePieceArrivee() throws Exception {

        DispositifArrivee da=new DispositifArrivee(5);
        assertEquals(5,da.getNombreDePieceArrivee());
    }

}