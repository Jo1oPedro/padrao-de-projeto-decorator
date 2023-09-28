public class Planeta extends CorpoCelesteDecorator {
    public Planeta(ICorpoCeleste $corpoCeles) {
        super($corpoCeles);
    }

    @Override
    public float getPeso() {
        return 0;
    }

    @Override
    public String getNomeEstrutura() {
        return null;
    }
}
