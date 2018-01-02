/**
 * Created by kissi on 28/12/17.
 */
public class Systeme {
    Piece piece=new Piece(0);

    DispositifArrivee Da=new DispositifArrivee(piece.nombre);
    DispositifTransport Dt= new DispositifTransport();
    DispositifEvacuation De=new DispositifEvacuation();


    //int nombreDePiece=Da.getNombreDePieceArrivee();
    void scenario()  {
        while(Piece.nombre>0){
            Dt.transporterPiece();
            De.evacuerPiece();


        }
    }

}
