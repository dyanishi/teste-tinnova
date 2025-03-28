//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao(1000, 800, 150);

        System.out.printf("Percentual de votos válidos: %.2f%% ", eleicao.percentualVotosValidos());
    }
}