/*  Created by IntelliJ IDEA.
 *  User: Lalit Saini (lalitsaini85)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailableBooks;

    public Library() {
        this.currentlyAvailableBooks = new Book[10];
        for (int index = 0; index < currentlyAvailableBooks.length; index++) {
            currentlyAvailableBooks[index] = new Book();
        }
    }

    public Library(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks.clone();
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getCurrentlyAvailableBooks(), library.getCurrentlyAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailableBooks());
    }

    @Override
    public String toString() {
        return "Library{" +
                "currently Available Books=" + Arrays.toString(currentlyAvailableBooks) +
                '}';
    }

    /**
     * This method shows a list of all the books in our library.
     */
    public void showAllBooks() {
        for (Book availableBook : currentlyAvailableBooks) {
            System.out.println(availableBook);
        }
    }
}
