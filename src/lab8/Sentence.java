package lab8;

public class Sentence extends Text{
    protected String word[];
    protected String sentence;

    public Sentence() {}

    public Sentence(String[] word, String sentence) {
        this.word = word;
        this.sentence = sentence;
    }

    public Sentence(String word, String sentence, String[] word1, String sentence1) {
        super(word, sentence);
        this.word = word1;
        this.sentence = sentence1;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    @Override
    public String getSentence() {
        return sentence;
    }

    @Override
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String mess() {
        String a = "";
        for(int i = 0; i<= word.length -1; i++) {
             a += word[i];
        }
        sentence = a;
        return a;
    }
}
