public class FeatureArticle extends Article {

    private String authorBio;

    public FeatureArticle(String title, int wordCount, String authorBio)
            throws InvalidWordCountException {

        super(title, wordCount);
        this.authorBio = authorBio;
    }

    public String getAuthorBio() {
        return authorBio;
    }

    @Override
    public void display() {
        System.out.println("Feature Article Details");
        System.out.println("Title: " + getTitle());
        System.out.println("Word Count: " + getWordCount());
        System.out.println("Author Bio: " + authorBio);
    }
}
