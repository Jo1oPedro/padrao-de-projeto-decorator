public class Cometa extends CorpoCelesteDecorator{
    public Cometa(ICorpoCeleste $corpoCeles) {
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
