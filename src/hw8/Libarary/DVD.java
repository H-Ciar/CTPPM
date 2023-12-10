package hw8.Libarary;

/**
 * Lớp Dvd là lớp biểu diễn cho một đĩa DVD trong thư viện.
 */
public class DVD extends Item {
    private int duration; // Thời lượng của DVD (phút)

    /**
     * Constructor khởi tạo một đối tượng Dvd với tiêu đề, năm, và thời lượng.
     *
     * @param title    Tiêu đề của DVD.
     * @param year     Năm sản xuất của DVD.
     * @param duration Thời lượng của DVD (phút).
     */
    public DVD(String title, int year, int duration) {
        super(title, year); // Gọi constructor của lớp cha (Item)
        this.duration = duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Phương thức trả về chuỗi mô tả đối tượng Dvd.
     *
     * @return Chuỗi mô tả đối tượng Dvd.
     */
    @Override
    public String toString() {
        return "Dvd [duration=" + duration +
                ", title='" + getTitle() + '\'' +
                ", year=" + getYear() +
                ']';
    }

    /**
     * Phương thức trả về thời lượng của DVD.
     *
     * @return Thời lượng của DVD (phút).
     */
    public int getDuration() {
        return duration;
    }


}
