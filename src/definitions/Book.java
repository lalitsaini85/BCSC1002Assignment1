/*  Created by IntelliJ IDEA.
 *  User: Lalit Saini (lalitsaini85)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBook;
    private String nameOfAuthorOfBook;
    private String isbnNumberOfBook;

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
}
