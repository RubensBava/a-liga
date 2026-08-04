public abstract class Personagem {
    public String nome;
    public enum sexo { MULHER, HOMEM, OUTRO, PREFIRO_NAO_DIZER };
    public double altura;

    public abstract String apresentar();
}

