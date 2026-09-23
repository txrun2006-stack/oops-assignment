
 # Publishing OOP Assignment

 ## 1\. Project Title

 **Publishing Scenario Using Java OOP Concepts**

---

 ## 2\. Problem Statement

 Develop a Java program for a publishing scenario using Object-Oriented Programming concepts.

 The program should contain an `Article` class with the attributes `title` and `wordCount`, along with a constructor. A subclass named `FeatureArticle` should extend `Article` and add an `authorBio` attribute. The `display()` method should be overridden in `FeatureArticle` to display all the details.

 An abstract class named `Review` should be created with an abstract method `publishReview()`. A class named `EditorReview` should extend `Review` and implement the `publishReview()` method.

 A custom exception named `InvalidWordCountException` should be created. This exception must be thrown whenever the article's word count is zero or negative.

 The program must demonstrate both normal and exceptional conditions.

---

 # 3\. Objective

 The objectives of this project are:

 - To understand Java classes and objects.
- To implement constructors.
- To demonstrate inheritance.
- To demonstrate method overriding.
- To implement abstraction using an abstract class.
- To demonstrate polymorphism.
- To implement a custom exception.
- To handle exceptions using `try-catch`.
- To test both valid and invalid inputs.
- To organize and upload a complete Java project to GitHub.

---

 # 4\. Project Structure

```
publishing-oop-assignment/
│
├── src/
│   ├── Article.java
│   ├── FeatureArticle.java
│   ├── Review.java
│   ├── EditorReview.java
│   ├── InvalidWordCountException.java
│   └── PublishingDemo.java
│
├── screenshots/
│   ├── compilation.png
│   ├── normal-output.png
│   ├── feature-article-output.png
│   ├── exception-output.png
│   └── complete-output.png
│
└── README.md
```

---

 # 5\. File Description

 | File | Description |
| --- | --- |
| `Article.java` | Defines the parent Article class |
| `FeatureArticle.java` | Defines the subclass of Article |
| `Review.java` | Defines the abstract Review class |
| `EditorReview.java` | Implements the Review functionality |
| `InvalidWordCountException.java` | Custom exception for invalid word counts |
| `PublishingDemo.java` | Main class used to execute and test the program |
| `README.md` | Project documentation |
| `screenshots/` | Contains screenshots of program execution |

---

 # 6\. OOP Concepts Used

 ## 6.1 Class and Object

 The program uses multiple classes:

 - `Article`
- `FeatureArticle`
- `Review`
- `EditorReview`
- `InvalidWordCountException`

 Objects are created from these classes in the `PublishingDemo` class.

 Example:

```
Article article = new Article("Introduction to Java", 1200);
```

---

 ## 6.2 Encapsulation

 The attributes of `Article` are declared as private.

```
private String title;
private int wordCount;
```

 Access to these values is provided through methods such as:

```
getTitle()
getWordCount()
```

 This protects the internal data of the class.

---

 ## 6.3 Inheritance

 `FeatureArticle` inherits from `Article`.

```
public class FeatureArticle extends Article
```

 This allows `FeatureArticle` to reuse the attributes and methods of `Article`.

 Similarly:

```
public class EditorReview extends Review
```

 allows `EditorReview` to inherit from the abstract `Review` class.

---

 ## 6.4 Polymorphism

 Polymorphism is demonstrated by overriding the `display()` method.

 The parent class has:

```
public void display()
```

 while `FeatureArticle` provides its own implementation:

```
@Override
public void display()
```

 Polymorphism is also demonstrated using:

```
Review review = new EditorReview();
review.publishReview();
```

---

 ## 6.5 Abstraction

 `Review` is an abstract class.

```
public abstract class Review {

    public abstract void publishReview();
}
```

 The abstract method is implemented by the child class `EditorReview`.

---

 ## 6.6 Method Overriding

 The `display()` method from `Article` is overridden in `FeatureArticle`.

```
@Override
public void display() {
    ...
}
```

---

 ## 6.7 Exception Handling

 The program uses `try-catch` blocks to handle invalid word counts.

```
try {
    Article article = new Article("Invalid Article", 0);
}
catch (InvalidWordCountException e) {
    System.out.println(e.getMessage());
}
```

---

 ## 6.8 Custom Exception

 The program defines its own exception:

```
public class InvalidWordCountException extends Exception
```

 It is thrown when the word count is zero or negative.

---

 # 7\. UML Class Diagram

```
                         ┌──────────────────────────────┐
                         │           Article            │
                         ├──────────────────────────────┤
                         │ - title : String             │
                         │ - wordCount : int            │
                         ├──────────────────────────────┤
                         │ + Article(String, int)       │
                         │ + getTitle() : String        │
                         │ + getWordCount() : int       │
                         │ + display() : void           │
                         └───────────────┬──────────────┘
                                         │
                                         │ extends
                                         ▼
                         ┌──────────────────────────────┐
                         │       FeatureArticle         │
                         ├──────────────────────────────┤
                         │ - authorBio : String         │
                         ├──────────────────────────────┤
                         │ + FeatureArticle(...)        │
                         │ + getAuthorBio() : String    │
                         │ + display() : void           │
                         └──────────────────────────────┘

                         ┌──────────────────────────────┐
                         │       <<abstract>>            │
                         │            Review             │
                         ├──────────────────────────────┤
                         │ + publishReview() : void     │
                         └───────────────┬──────────────┘
                                         │
                                         │ extends
                                         ▼
                         ┌──────────────────────────────┐
                         │        EditorReview          │
                         ├──────────────────────────────┤
                         │ + publishReview() : void     │
                         └──────────────────────────────┘

                         ┌──────────────────────────────┐
                         │ InvalidWordCountException    │
                         ├──────────────────────────────┤
                         │ extends Exception            │
                         └──────────────────────────────┘
```

---

 # 8\. Relationship Between Classes

```
Article
   ▲
   │
   │ extends
   │
FeatureArticle

Review
   ▲
   │
   │ extends
   │
EditorReview

Article
   │
   │ throws
   ▼
InvalidWordCountException
```

---

 # 9\. Algorithm

 ## Article Algorithm

 1. Start the program.
2. Receive the article title.
3. Receive the word count.
4. Check whether the word count is less than or equal to zero.
5. If the word count is invalid, throw `InvalidWordCountException`.
6. Otherwise, create the `Article` object.
7. Display the article details.

 ## FeatureArticle Algorithm

 1. Receive title, word count, and author biography.
2. Call the parent `Article` constructor using `super()`.
3. Validate the word count.
4. Store the author biography.
5. Override the `display()` method.
6. Display title, word count, and author biography.

 ## Review Algorithm

 1. Create an abstract class named `Review`.
2. Declare `publishReview()` as an abstract method.
3. Create `EditorReview` as a subclass.
4. Override `publishReview()`.
5. Create an `EditorReview` object.
6. Call `publishReview()`.

 ## Exception Algorithm

 1. Create an article with a valid word count.
2. Create another article with word count `0`.
3. Create another article with a negative word count.
4. If the word count is invalid, throw `InvalidWordCountException`.
5. Catch the exception using `try-catch`.
6. Display an appropriate error message.

---

 # 10\. Source Code

 ## 10.1 InvalidWordCountException.java

```
public class InvalidWordCountException extends Exception {

    public InvalidWordCountException(String message) {
        super(message);
    }
}
```

---

 ## 10.2 Article.java

```
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
```

---

 ## 10.3 FeatureArticle.java

```
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
```

---

 ## 10.4 Review.java

```
public abstract class Review {

    public abstract void publishReview();
}
```

---

 ## 10.5 EditorReview.java

```
public class EditorReview extends Review {

    @Override
    public void publishReview() {
        System.out.println("Editor review has been published.");
    }
}
```

---

 ## 10.6 PublishingDemo.java

```
public class PublishingDemo {

    public static void main(String[] args) {

        System.out.println("===== Publishing System Demo =====\n");

        // Test Case 1: Valid Article
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

        // Test Case 2: Valid Feature Article
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

        // Test Case 3: Polymorphism and Abstraction
        Review review = new EditorReview();
        review.publishReview();

        System.out.println();

        // Test Case 4: Zero Word Count
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

        // Test Case 5: Negative Word Count
        try {
            FeatureArticle invalidFeatureArticle =
                    new FeatureArticle(
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
```

---

 # 11\. How to Compile the Program

 Make sure Java JDK is installed.

 Check the Java version:

```
java -version
```

 Check the Java compiler:

```
javac -version
```

 Navigate to the project directory:

```
cd publishing-oop-assignment
```

 Compile all source files:

```
javac -d out src/*.java
```

 The compiled `.class` files will be placed in the `out` directory.

---

 # 12\. How to Run the Program

 After successful compilation, run:

```
java -cp out PublishingDemo
```

---

 # 13\. Sample Output

```
===== Publishing System Demo =====

Article Details
Title: Introduction to Java
Word Count: 1200

Feature Article Details
Title: The Future of Technology
Word Count: 2500
Author Bio: John Smith is a technology writer with 10 years of experience.

Editor review has been published.

Exception Test 1:
Error: Word count must be greater than zero.

Exception Test 2:
Error: Word count must be greater than zero.

===== End of Demo =====
```

---

 # 14\. Test Cases

 | Test Case | Input | Expected Output | Result |
| --- | --- | --- | --- |
| TC01 | Article with word count `1200` | Article details displayed | Pass |
| TC02 | FeatureArticle with word count `2500` | All feature article details displayed | Pass |
| TC03 | `EditorReview` object | Review publication message displayed | Pass |
| TC04 | Article with word count `0` | `InvalidWordCountException` | Pass |
| TC05 | FeatureArticle with word count `-500` | `InvalidWordCountException` | Pass |

---

 # 15\. Test Case 1 – Valid Article

 ### Input

```
Title = Introduction to Java
Word Count = 1200
```

 ### Expected Output

```
Article Details
Title: Introduction to Java
Word Count: 1200
```

 ### Status

 **PASS**

---

 # 16\. Test Case 2 – Valid Feature Article

 ### Input

```
Title = The Future of Technology
Word Count = 2500
Author Bio = John Smith is a technology writer with 10 years of experience.
```

 ### Expected Output

```
Feature Article Details
Title: The Future of Technology
Word Count: 2500
Author Bio: John Smith is a technology writer with 10 years of experience.
```

 ### Status

 **PASS**

---

 # 17\. Test Case 3 – Editor Review

 ### Input

```
Review review = new EditorReview();
review.publishReview();
```

 ### Expected Output

```
Editor review has been published.
```

 ### Status

 **PASS**

---

 # 18\. Test Case 4 – Zero Word Count

 ### Input

```
Word Count = 0
```

 ### Expected Output

```
Exception Test 1:
Error: Word count must be greater than zero.
```

 ### Status

 **PASS**

---

 # 19\. Test Case 5 – Negative Word Count

 ### Input

```
Word Count = -500
```

 ### Expected Output

```
Exception Test 2:
Error: Word count must be greater than zero.
```

 ### Status

 **PASS**

---

 # 20\. Normal Condition

 The program handles positive word counts successfully.

 For example:

```
Article article = new Article("Introduction to Java", 1200);
article.display();
```

 Output:

```
Article Details
Title: Introduction to Java
Word Count: 1200
```

 The object is successfully created and its details are displayed.

---

 # 21\. Exceptional Condition

 The program does not allow a word count of zero or a negative word count.

 For example:

```
Article article = new Article("Invalid Article", 0);
```

 This causes:

```
InvalidWordCountException
```

 The exception is handled using:

```
try {
    // code
}
catch (InvalidWordCountException e) {
    System.out.println(e.getMessage());
}
```

 Output:

```
Error: Word count must be greater than zero.
```

---

 # 22\. Challenges Faced and Solutions

 ## Challenge 1: Validating Word Count

 A word count of zero or less is invalid.

 ### Solution

 A custom exception named `InvalidWordCountException` was created.

```
if (wordCount <= 0) {
    throw new InvalidWordCountException(
        "Word count must be greater than zero."
    );
}
```

---

 ## Challenge 2: Reusing the Parent Constructor

 `FeatureArticle` needs the validation already implemented in `Article`.

 ### Solution

 The `FeatureArticle` constructor calls:

```
super(title, wordCount);
```

 This reuses the parent class constructor and its validation.

---

 ## Challenge 3: Implementing Abstraction

 The `Review` class should provide a common structure without being directly instantiated.

 ### Solution

 `Review` was declared as an abstract class:

```
public abstract class Review
```

 and contains:

```
public abstract void publishReview();
```

---

 ## Challenge 4: Demonstrating Polymorphism

 The program needs to demonstrate a parent reference referring to a child object.

 ### Solution

```
Review review = new EditorReview();
review.publishReview();
```

 Here, `review` is a `Review` reference but the actual object is an `EditorReview`.

---

 # 23\. Screenshots

 Screenshots should be captured after actually compiling and running the program.

 Store them inside the `screenshots` folder.

 Recommended files:

```
screenshots/
├── compilation.png
├── normal-output.png
├── feature-article-output.png
├── exception-output.png
└── complete-output.png
```

 ## Screenshot 1 – Compilation

 Take a screenshot showing:

```
javac -d out src/*.java
```

 with no compilation errors.

---

 ## Screenshot 2 – Normal Execution

 Take a screenshot showing the valid Article and FeatureArticle output.

---

 ## Screenshot 3 – Editor Review

 Take a screenshot showing:

```
Editor review has been published.
```

---

 ## Screenshot 4 – Exception Handling

 Take a screenshot showing:

```
Exception Test 1:
Error: Word count must be greater than zero.

Exception Test 2:
Error: Word count must be greater than zero.
```

---

 ## Screenshot 5 – Complete Program

 Take a screenshot showing the complete terminal output.

---

 # 24\. GitHub Repository

 Create a GitHub repository with the name:

```
publishing-oop-assignment
```

 The final repository should contain:

```
publishing-oop-assignment/
│
├── src/
│   ├── Article.java
│   ├── FeatureArticle.java
│   ├── Review.java
│   ├── EditorReview.java
│   ├── InvalidWordCountException.java
│   └── PublishingDemo.java
│
├── screenshots/
│   ├── compilation.png
│   ├── normal-output.png
│   ├── feature-article-output.png
│   ├── exception-output.png
│   └── complete-output.png
│
└── README.md
```

---

 # 25\. Git Commands

 After creating the GitHub repository, open a terminal in the project folder.

 Initialize Git:

```
git init
```

 Add all files:

```
git add .
```

 Create the first commit:

```
git commit -m "Add publishing OOP assignment"
```

 Set the main branch:

```
git branch -M main
```

 Connect the GitHub repository:

```
git remote add origin https://github.com/YOUR_USERNAME/publishing-oop-assignment.git
```

 Push the project:

```
git push -u origin main
```

 Replace:

```
YOUR_USERNAME
```

 with your actual GitHub username.

---

 # 26\. Final Repository Checklist

 Before submitting the assignment, verify that:

 - [ ] `Article.java` is present.
- [ ] `FeatureArticle.java` is present.
- [ ] `Review.java` is present.
- [ ] `EditorReview.java` is present.
- [ ] `InvalidWordCountException.java` is present.
- [ ] `PublishingDemo.java` is present.
- [ ] `README.md` is present.
- [ ] UML class diagram is included in the README.
- [ ] OOP concepts are explained.
- [ ] Algorithm is included.
- [ ] Program execution instructions are included.
- [ ] Sample output is included.
- [ ] Test cases are included.
- [ ] Normal condition is demonstrated.
- [ ] Exceptional condition is demonstrated.
- [ ] Screenshots are uploaded.
- [ ] GitHub repository is created.
- [ ] All `.java` files are uploaded.
- [ ] The program compiles without errors.
- [ ] The program runs successfully.

---

 # 27\. Conclusion

 This project successfully demonstrates the use of Java Object-Oriented Programming concepts in a publishing scenario.

 The project uses:

 - Classes and objects
- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Method overriding
- Abstraction
- Abstract classes
- Custom exceptions
- Exception handling

 The program also demonstrates both valid and invalid word-count conditions and handles invalid input using a custom `InvalidWordCountException`.

---

 **End of Project**
