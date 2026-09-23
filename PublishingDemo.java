public class PublishingDemo {

    public static void main(String[] args) {

        System.out.println("===== Publishing System Demo =====\n");

        // Test Case 1: Normal Article
        try {
            Article article = new Article(
                    "Introduction to Java",
                    1200
            );

            article.display();

        } catch (InvalidWordCountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Test Case 2: Normal Feature Article
        try {
            FeatureArticle featureArticle = new FeatureArticle(
                    "The Future of Technology",
                    2500,
                    "John Smith is a technology writer with 10 years of experience."
            );

            featureArticle.display();

        } catch (InvalidWordCountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Test Case 3: Abstract class / inheritance demonstration
        Review review = new EditorReview();
        review.publishReview();

        System.out.println();

        // Test Case 4: Invalid word count = 0
        try {
            Article invalidArticle = new Article(
                    "Invalid Article",
                    0
            );

            invalidArticle.display();

        } catch (InvalidWordCountException e) {
            System.out.println("Exception Test 1:");
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Test Case 5: Invalid negative word count
        try {
            FeatureArticle invalidFeatureArticle = new FeatureArticle(
                    "Negative Word Count Article",
                    -500,
                    "Invalid test author."
            );

            invalidFeatureArticle.display();

        } catch (InvalidWordCountException e) {
            System.out.println("Exception Test 2:");
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n===== End of Demo =====");
    }
}
