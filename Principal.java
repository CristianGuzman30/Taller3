import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;




public class Principal {
    public static void main(String [] args) {
        Hilo1 hilo1 = new Hilo1 ();
        Hilo2 hilo2 = new Hilo2 ();
        sonido musica = new sonido();

	  musica.start();
        
        
       hilo1.start();
       hilo2.start();
       
    }
}

class sonido extends Thread{
    public void run() {
        try {
            File archivo = new File("C:/Users/Cristian/Documents/Aplicaciones_Moviles/cdgr/Hilos/cancion.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(archivo));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Error al reproducir la canción: " + e.getMessage());
        }
    }
}

class Hilo1 extends Thread {
    public void run(){
        for(int i=0; i<= 8; i++){
            System.out.println("Numero " + i);
        }       
   } 
}

class Hilo2 extends Thread{
    public void run(){
        for(int i=0; i>= -7; i--){
            System.out.println("Numero " + i);
        }       
   } 
}