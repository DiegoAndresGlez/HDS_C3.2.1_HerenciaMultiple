public class Jugador implements Personaje,Usuario{
    private int experiencia, puntos;

    public void setExperiencia(int e){
        experiencia = e;
    }

    public int getExperiencia(){
        return experiencia;
    }

    public void ganarExperiencia(int e){
        experiencia += e;
    }

    public void setPuntos(int p) {
        puntos = p;    
    }

    public int getPuntos() {
        return puntos;
    }

    public void ganarPuntos(int p){
        puntos += p;
    }

    public String toString(){
        return "Experiencia: "+experiencia+"\n"+"Puntos: "+puntos+"\n";
    }

    public static void main(String[] args){
        Jugador jugador = new Jugador();
        jugador.setExperiencia(100);
        jugador.setPuntos(350);
        jugador.ganarExperiencia(50);
        jugador.ganarPuntos(50);
        System.out.println(jugador.toString());
    }
}
