public class Vilao extends Personagem {
    private int nivelDeAmeaca;


    public void setNivelDeAmeaca(int nivel) {
        if (nivel < 1) nivel = 1;
        else if (nivel > 10) nivel = 10;
        this.nivelDeAmeaca = nivel;
    }


public int getNivelDeAmeaca(){
    return  nivelDeAmeaca;


}

}
