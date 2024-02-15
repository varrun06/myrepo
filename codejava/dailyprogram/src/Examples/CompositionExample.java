package Examples;
//CompositionExample

class Author {
 String name;

 Author(String name) {
     this.name = name;
 }
}

class Book {
 String title;
 Author author;

 Book(String title, Author author) {
     this.title = title;
     this.author = author;
 }

 void displayInfo() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author.name);
 }
}

public class CompositionExample {
 public static void main(String[] args) {
     
     Author author = new Author("J.K. Rowling");

    
     Book book = new Book("Harry Potter and the Sorcerer's Stone", author);

     
     book.displayInfo();
 }
}
