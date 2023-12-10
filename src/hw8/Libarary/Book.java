package hw8.Libarary;

public class Book extends Item {
    private int pages;

    /**
     * Constructor khởi tạo một đối tượng Item với tiêu đề và năm.
     *
     * @param title Tiêu đề của sách hoặc DVD.
     * @param year  Năm xuất bản hoặc sản xuất.
     */
    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book[" + "pages=" + pages
                + ", title=" + this.getTitle()
                + ", year=" + this.getYear() + "]";
    }
}
