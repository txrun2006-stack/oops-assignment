public class Article {

    private String title;
    private int wordCount;

    public Article(String title, int wordCount)
            throws InvalidWordCountException {

        if (wordCount <= 0) {
            throw new InvalidWordCountException(
                    "Word count must be greater than zero."
            );
        }

        this.title = title;
        this.wordCount = wordCount;
    }

    public String getTitle() {
        return title;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void display() {
        System.out.println("Article Details");
        System.out.println("Title: " + title);
        System.out.println("Word Count: " + wordCount);
    }
}
