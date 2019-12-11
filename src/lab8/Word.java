package lab8;

public class Word extends Sentence {
    public Word() {
        super();
    }

    public Word(String[] word, String sentence) {
        super(word, sentence);
    }

    @Override
    public String CreateText() {
        return super.CreateText();
    }

    @Override
    public String CreateText(String sentence) {
        return super.CreateText(sentence);
    }

    @Override
    public String CreateText(String sentence, int x) {
        return super.CreateText(sentence, x);
    }
}
