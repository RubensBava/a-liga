public abstract class Personagem {
    private String nome;
    private int sexo;                // 1=Mulher, 2=Homem, 3=Outro, 4=Prefiro não dizer
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract String apresentar();
}

