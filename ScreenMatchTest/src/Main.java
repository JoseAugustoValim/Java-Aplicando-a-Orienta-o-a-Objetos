import br.com.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Furiosa. Uma saga Mad Max");
        filme.setAnoLancamento(2024);
        filme.setDuracaoMinuto(250);

        filme.exibirFicharTecnica();
        filme.somaAvaliacao(8.0);
        filme.somaAvaliacao(5.0);
        filme.somaAvaliacao(10.0);
        System.out.println(filme.getSomaAvaliacao());
        System.out.println(filme.getTotalAvaliacao());
        System.out.println(filme.calculaMedia());
    }
}
