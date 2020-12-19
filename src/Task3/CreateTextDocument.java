package Task3;

public class CreateTextDocument implements ICreateDocument{

    @Override
    public IDocument CreateNew() {
        return (IDocument) new TexrDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return (IDocument) new TexrDocument();
    }
}
