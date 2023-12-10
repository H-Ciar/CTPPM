package hw8.Libarary;

/**
 * Lớp Item là lớp chung cho cả sách và DVD trong thư viện.
 */
public abstract class Item {
    private String title; // Tiêu đề của sách hoặc DVD
    private int year; // Năm xuất bản hoặc sản xuất

    /**
     * Constructor khởi tạo một đối tượng Item với tiêu đề và năm.
     *
     * @param title Tiêu đề của sách hoặc DVD.
     * @param year  Năm xuất bản hoặc sản xuất.
     */
    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    /**
     * Phương thức trả về chuỗi mô tả đối tượng Item.
     *
     * @return Chuỗi mô tả đối tượng Item.
     */
    @Override
    public String toString() {
        return "Item [title='" + title + "', year=" + year + ']';
    }

    /**
     * Phương thức trả về tiêu đề của Item.
     *
     * @return Tiêu đề của Item.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Phương thức trả về năm của Item.
     *
     * @return Năm của Item.
     */
    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
