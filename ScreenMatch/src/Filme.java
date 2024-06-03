public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double avaliacao;
    int totalAvaliacao;
    int duracaoMinuto;

    public void exibirFicharTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano Lancamento: " + anoLancamento);
        System.out.println("Duracao em minutos: " + duracaoMinuto);
    }

    public void somaAvaliacao(Double nota){
        avaliacao += nota;
        totalAvaliacao++;
    }

    public Double calculaMedia(){
        return avaliacao/totalAvaliacao;
    }
}
