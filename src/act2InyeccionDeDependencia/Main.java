package act2InyeccionDeDependencia;

public class Main {

	public static void main(String[] args) {
		 Jugador eva = new Jugador("Eva", new Teclado());
         Jugador juan = new Jugador("Juan", new CPU());
         Juego ppt = new Juego(eva, juan, new JuegoPPT(),new Consola());
         ppt.jugar();
         //Juego con BigBang
         System.out.print("Version Big-bang theory automatica \n");
         Jugador dario=new Jugador("Dario", new CPU());
         Jugador pepe=new Jugador("Pepe", new CPU());
         Juego pptls = new Juego(dario, pepe, new JuegoPPTLS(),new Consola());
         pptls.jugar();

	}

}
