package votacao;
public class Votacao {
    String votacao;
    String descricao;
    public Votacao(String votacao){
        this.votacao=votacao;
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){

    this.descricao=descricao;
    
    }
    public String getVotacao() {
        return votacao;
        
    }
   public void setVotacao(String votacao) {
        this.votacao=votacao;    

    }

    public void processarResultado() {
        System.out.println("Resultado"+ votacao);
        
    }
}