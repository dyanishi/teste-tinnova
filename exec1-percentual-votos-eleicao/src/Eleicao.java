public class Eleicao {

    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    public Eleicao(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    // Metodo para calcular o percentual de votos válidos
    public double percentualVotosValidos() {
        return ((double) votosValidos / totalEleitores) * 100;
    }

    // Metodo para calcular o percentual de votos brancos
    public double percentualVotosBrancos() {
        return ((double) votosBrancos / totalEleitores) * 100;
    }

    // Metodo para calcular o percentual de votos nulos
    public double percentualVotosNulos() {
        return ((double) votosNulos / totalEleitores) * 100;
    }
}
