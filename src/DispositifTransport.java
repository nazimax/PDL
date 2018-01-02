import static java.lang.Thread.sleep;

/**
 * Created by kissi on 28/12/17.
 */
public class DispositifTransport {
    Bras bras=new Bras();
    Pince pince =new Pince();


    void transporterPiece(){
        if(prendrePiece()){
            System.out.println("nombre piece : "+Piece.nombre);
            System.out.println("pièce prise");
            monter();
            avancer();
            reculer();
            deposerPiece();
            Piece.nombre--;
            descendre();
            }



    }
    boolean prendrePiece(){
        pince.setLibre(Piece.nombre==0);
        return Piece.nombre!=0;
    }
    void monter(){
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("entrain de monter ...");
    }
    void deposerPiece(){
        System.out.println("pièce deposée");
        pince.setLibre(true);
    }
    void descendre(){
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("entrain de descendre ...");

    }
    void reculer()  {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("entrain de reculer ...");

    }
    void avancer(){

        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("entrain d'avancer ...");

    }
}
