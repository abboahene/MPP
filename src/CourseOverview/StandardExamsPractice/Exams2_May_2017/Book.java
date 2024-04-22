package CourseOverview.StandardExamsPractice.Exams2_May_2017;

import java.util.Objects;

public class Book extends LendingItem {

    private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private int numCopiesInLib;

    public Book(String isbn, String title, String authorFirstName, String authorLastName) {
        super();
        this.isbn = isbn;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    @Override
    public int hashCode(){
        return Objects.hash(isbn);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || o.getClass() != getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.getIsbn());
    }
}
