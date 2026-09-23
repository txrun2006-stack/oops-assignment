# Publishing OOP Assignment

## 1. Problem Statement

Create a Java program for a publishing scenario using object-oriented programming concepts.

The program must contain an Article class with title and wordCount attributes and a constructor. A FeatureArticle subclass must extend Article and add an authorBio attribute. The display() method must be overridden to display all feature article details.

An abstract Review class must also be created with an abstract publishReview() method. An EditorReview class must extend Review and implement the publishReview() method.

A custom InvalidWordCountException must be created and thrown whenever the word count is zero or negative.

---

## 2. Objective

The objectives of this assignment are:

- To understand Java classes and objects.
- To implement inheritance.
- To demonstrate method overriding.
- To understand abstraction using abstract classes.
- To implement custom exception handling.
- To demonstrate normal and exceptional program execution.
- To develop and test a complete Java application.

---

## 3. OOP Concepts Used

### Class and Object

Classes such as Article, FeatureArticle, and EditorReview are used to create objects.

### Encapsulation

The attributes of Article and FeatureArticle are declared private and accessed through methods.

### Inheritance

FeatureArticle extends Article.

EditorReview extends Review.

### Polymorphism

The display() method is overridden in FeatureArticle.

A Review reference can refer to an EditorReview object.

### Abstraction

Review is declared as an abstract class and contains the abstract method publishReview().

### Exception Handling

The program uses try-catch blocks to handle InvalidWordCountException.

### Custom Exception

InvalidWordCountException is a user-defined exception that is thrown when wordCount is zero or negative.

---

## 4. Class Diagram

```text
                    +----------------------+
                    |       Article        |
                    +----------------------+
                    | - title : String    |
                    | - wordCount : int    |
                    +----------------------+
                    | + Article(...)       |
                    | + display()          |
                    +----------+-----------+
                               |
                               | extends
                               |
                    +----------v-----------+
                    |   FeatureArticle     |
                    +----------------------+
                    | - authorBio : String |
                    +----------------------+
                    | + FeatureArticle(...)|
                    | + display()          |
                    +----------------------+


                    +----------------------+
                    | <<abstract>> Review  |
                    +----------------------+
                    | + publishReview()    |
                    +----------+-----------+
                               |
                               | extends
                               |
                    +----------v-----------+
                    |    EditorReview      |
                    +----------------------+
                    | + publishReview()    |
                    +----------------------+

                    +-----------------------------+
                    | InvalidWordCountException   |
                    +-----------------------------+
                    | extends Exception           |
                    +-----------------------------+
