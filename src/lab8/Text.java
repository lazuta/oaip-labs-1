package lab8;

public class Text {
    protected String word;
    protected String sentence;

    public Text() {}

    public Text(String word, String sentence) {
        this.word = word;
        this.sentence = sentence;
    }

    public Text(String a) {
        this.sentence = a;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String CreateText() {
        return sentence;
    }

    public String CreateText(String sentence) {
        return sentence;
    }

    public String CreateText(String sentence, int x) {
        return x + ": " + sentence + ".";
    }

    @Override
    public String toString() {
        return "Text{" +
                "word='" + word + '\'' +
                ", sentence='" + sentence + '\'' +
                '}';
    }
}
