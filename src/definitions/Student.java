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
    private String nameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] allNamesOfBooksIssuedByStudent;

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
}
