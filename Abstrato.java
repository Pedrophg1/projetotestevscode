package votacao;

public abstract class Abstrato {
    private String nome;
    private String partido;

    public Abstrato(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
    

