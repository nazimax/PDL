import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kissi on 02/01/18.
 */
public class DispositifEvacuationTest {
    @Test
    public void evacuerPiece() throws Exception {

        DispositifEvacuation de=new DispositifEvacuation();
        de.evacuerPiece();
        assertEquals(1,de.nombreDePieceEvacue);
    }

}