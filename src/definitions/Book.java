/*  Created by IntelliJ IDEA.
 *  User: Lalit Saini (lalitsaini85)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private String nameOfAuthorOfBook;
    private String isbnNumberOfBook;

    public Book() {
        nameOfBook = "Sun Certified Programmer For Java";
        nameOfAuthorOfBook = "Kathy Sierra";
        isbnNumberOfBook = "OOP1219";
    }

    public Book(String nameOfBook, String nameOfAuthorOfBook, String isbnNumberOfBook) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    public Book(String nameOfBook) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthorOfBook = "Sierra Kathy";
        this.isbnNumberOfBook = "OCA1219";
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfAuthorOfBook() {
        return nameOfAuthorOfBook;
    }

    public void setNameOfAuthorOfBook(String nameOfAuthorOfBook) {
        this.nameOfAuthorOfBook = nameOfAuthorOfBook;
    }

    public String getIsbnNumberOfBook() {
        return isbnNumberOfBook;
    }

    public void setIsbnNumberOfBook(String isbnNumberOfBook) {
        this.isbnNumberOfBook = isbnNumberOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", nameOfAuthorOfBook='" + nameOfAuthorOfBook + '\'' +
                ", isbnNumberOfBook='" + isbnNumberOfBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(getNameOfAuthorOfBook(), book.getNameOfAuthorOfBook()) &&
                Objects.equals(getIsbnNumberOfBook(), book.getIsbnNumberOfBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getNameOfAuthorOfBook(), getIsbnNumberOfBook());
    }
}
