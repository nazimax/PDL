import static java.lang.Thread.sleep;

/**
 * Created by kissi on 28/12/17.
 */
public class DispositifEvacuation {
    private boolean libre=true;
    static int nombreDePieceEvacue=0;
    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    void evacuerPiece()  {
        this.libre=false;
        System.out.println("evacuation en cours ...");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nombreDePieceEvacue++;
        System.out.println("evacuation terminé ");

        System.out.println("=========Le nombre de pièce evacué est :** "+nombreDePieceEvacue+" **");
        this.libre=true;

    }
}
