/*  Created by IntelliJ IDEA.
 *  User: Lalit Saini (lalitsaini85)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    Book book = new Book();
    private String nameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] allNamesOfBooksIssuedByStudent;

    public Student(String nameOfStudent, long universityRollNumberOfStudent, int numberOfBooksIssuedByStudent, Book[] allNamesOfBooksIssuedByStudent) {
        this.nameOfStudent = nameOfStudent;
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.allNamesOfBooksIssuedByStudent = allNamesOfBooksIssuedByStudent;
    }

    public Student() {
        nameOfStudent = getNameOfStudent();
        universityRollNumberOfStudent = getUniversityRollNumberOfStudent();
        numberOfBooksIssuedByStudent = getNumberOfBooksIssuedByStudent();
        this.allNamesOfBooksIssuedByStudent = new Book[numberOfBooksIssuedByStudent];
        for (int index = 0; index < allNamesOfBooksIssuedByStudent.length; index++) {
            allNamesOfBooksIssuedByStudent[index] = new Book();
        }
    }

    public Student(Book[] allNamesOfBooksIssuedByStudent) {
        this.allNamesOfBooksIssuedByStudent = allNamesOfBooksIssuedByStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public long getUniversityRollNumberOfStudent() {
        return universityRollNumberOfStudent;
    }

    public void setUniversityRollNumberOfStudent(long universityRollNumberOfStudent) {
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getAllNamesOfBooksIssuedByStudent() {
        return allNamesOfBooksIssuedByStudent.clone();
    }

    public void setAllNamesOfBooksIssuedByStudent(Book[] allNamesOfBooksIssuedByStudent) {
        this.allNamesOfBooksIssuedByStudent = allNamesOfBooksIssuedByStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumberOfStudent() == student.getUniversityRollNumberOfStudent() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Objects.equals(getNameOfStudent(), student.getNameOfStudent()) &&
                Arrays.equals(getAllNamesOfBooksIssuedByStudent(), student.getAllNamesOfBooksIssuedByStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameOfStudent(), getUniversityRollNumberOfStudent(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getAllNamesOfBooksIssuedByStudent());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name of the Student='" + nameOfStudent + '\'' +
                ", university Roll Number of the Student=" + universityRollNumberOfStudent +
                ", number of the Books Issued by the Student=" + numberOfBooksIssuedByStudent +
                ", all Names of the Books Issued by the Student=" + Arrays.toString(allNamesOfBooksIssuedByStudent) +
                '}';
    }

    /**
     * This method displays issued book by the student.
     *
     * @param bookName    The name of the book to be added.
     * @param studentName The name of the student to be added.
     */
    public void addIssuedBook(String bookName, String studentName) {
        System.out.println(studentName + ", You have issued " + bookName + ".");
        for (int i = 0; i < allNamesOfBooksIssuedByStudent.length; i++) {
            allNamesOfBooksIssuedByStudent[i] = book.setNameOfBook(bookName);
        }
    }

    /**
     * This method displays list of all the issued book by the student.
     */
    public void showAllMyIssuedBooks() {
        for (Book book : allNamesOfBooksIssuedByStudent) {
            System.out.println(book);
        }
    }

    /**
     * This method display return book.
     *
     * @param bookName name of the book that you have returned.
     */
    public void doReturnBook(String bookName) {
        System.out.println("Thank you for returning Book: " + bookName);
    }
}
