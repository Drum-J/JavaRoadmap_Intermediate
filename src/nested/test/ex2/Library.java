package nested.test.ex2;

public class Library {
    private Book[] books;
    private int index;

    public Library(int count) {
        this.books = new Book[count];
    }

    public void addBook(String title, String author) {
        if (books.length == index) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[index++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < index; i++) {
            printBook(books[i]);
        }

    }

    private void printBook(Book book) {
        System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
    }

    private static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
