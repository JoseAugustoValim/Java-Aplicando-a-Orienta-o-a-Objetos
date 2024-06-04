package br.com.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoMinuto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public int getDuracaoMinuto() {
        return duracaoMinuto;
    }

    public void setDuracaoMinuto(int duracaoMinuto) {
        this.duracaoMinuto = duracaoMinuto;
    }

    public void exibirFicharTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano Lancamento: " + anoLancamento);
        System.out.println("Duracao em minutos: " + duracaoMinuto);
    }

    public void somaAvaliacao(Double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    public Double calculaMedia() {
        return somaAvaliacao / totalAvaliacao;
    }
}

