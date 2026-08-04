public abstract class Personagem {
    private String nome;
    private enum sexo { MULHER, HOMEM, OUTRO, PREFIRO_NAO_DIZER };
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

