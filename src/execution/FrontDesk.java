/*  Created by IntelliJ IDEA.
 *  User: Lalit Saini (lalitsaini85)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUES_BOOK = 2;
    private static final int SHOW_ALL_MY_ISSUES_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        int countOfIssuedBook = 0;
        Library myBooks = new Library();
        Book book = new Book();
        Student student = new Student();
        do {
            System.out.println("Enter your name: ");
            String studentName = scanner.nextLine();
            student.setNameOfStudent(studentName);
            System.out.println("Enter your university roll number: ");
            long universityNumber = scanner.nextLong();
            student.setUniversityRollNumberOfStudent(universityNumber);
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice from 1 to 4: ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Enter the name of the book that you want: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    book.setNameOfBook(bookName);
                    student.addIssuedBook(bookName, studentName);
                    countOfIssuedBook += 1;
                    student.setNumberOfBooksIssuedByStudent(countOfIssuedBook);
                    break;
                case RETURN_PREVIOUSLY_ISSUES_BOOK:
                    break;
                case SHOW_ALL_MY_ISSUES_BOOKS:
                    System.out.println(student.getNumberOfBooksIssuedByStudent());
                    System.out.println(book.getNameOfBook());
                    student.showAllMyIssuedBooks();
                    break;
                default:
                    System.out.println("WRONG CHOICE!!");
            }
        } while (studentInput != EXIT);
    }
}
