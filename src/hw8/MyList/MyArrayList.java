package hw8.MyList;

public class MyArrayList extends MyAbstractList {
    private static final int INITIAL_SIZE = 16; // Kích thước khởi tạo ban đầu cho mảng
    private Object[] elements; // Mảng lưu trữ các phần tử
    private int size; // Số lượng phần tử hiện tại trong mảng

    // Constructor khởi tạo
    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    // Thêm một phần tử vào cuối danh sách
    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge(); // Nếu mảng đầy, tăng kích thước mảng
        }
        elements[size++] = o; // Thêm phần tử và tăng kích thước danh sách
    }

    // Thêm một phần tử vào vị trí có chỉ số cụ thể
    @Override
    public void add(Object o, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size >= elements.length - 1) {
            enlarge(); // Nếu mảng đầy, tăng kích thước mảng
        }
        // Dời các phần tử để tạo chỗ cho phần tử mới tại chỉ số cụ thể
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = o; // Thêm phần tử vào vị trí chỉ định
        size++;
    }

    // Xóa một phần tử tại chỉ số cụ thể
    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        // Dời các phần tử để xóa phần tử tại chỉ số cụ thể
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size - 1] = null; // Tuỳ chọn: Đặt phần tử cuối cùng thành null
        size--;
    }

    // Lấy phần tử tại chỉ số cụ thể
    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    // Trả về kích thước hiện tại của danh sách
    @Override
    public int size() {
        return size;
    }

    // Kiểm tra giới hạn chỉ số
    private void checkBoundaries(int index, int maxIndex) {
        if (index < 0 || index > maxIndex) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Mở rộng kích thước của mảng
    private void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
