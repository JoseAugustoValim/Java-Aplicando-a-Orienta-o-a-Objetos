public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Furiosa. Uma saga Mad Max";
        filme.anoLancamento = 2024;
        filme.duracaoMinuto = 250;

        filme.exibirFicharTecnica();
        filme.somaAvaliacao(8.0);
        filme.somaAvaliacao(5.0);
        filme.somaAvaliacao(10.0);
        System.out.println(filme.avaliacao);
        System.out.println(filme.totalAvaliacao);
        System.out.println(filme.calculaMedia());
    }
}
