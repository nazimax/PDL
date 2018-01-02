import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kissi on 02/01/18.
 */
public class DispositifTransportTest {
    @Test
    public void transporterPiece() throws Exception {
        DispositifTransport dt= new DispositifTransport();
        Piece.nombre=4;
        dt.transporterPiece();
        assertEquals(3,Piece.nombre);
    }

}