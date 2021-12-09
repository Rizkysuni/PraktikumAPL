public class rabbitadapterImpl implements rabbitadapter{
    private rabbit g;

    public rabbitadapterImpl(rabbit g)
    {
        this.g = g;
    }

    @Override
    public int getkg() {
        int gram = g.getkg();
        return convertkgtogram(gram);
    }

    private int convertkgtogram(int gram)
    {
        return gram*1000;
    }
}
