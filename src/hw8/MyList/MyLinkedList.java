package hw8.MyList;

/**
 * Implement một phiên bản đơn giản của danh sách liên kết (LinkedList).
 */
public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head; // Đỉnh của danh sách liên kết
    private int size; // Số lượng phần tử trong danh sách

    /**
     * Constructor khởi tạo danh sách liên kết.
     */
    public MyLinkedList() {
        head = null; // Ban đầu danh sách trống
        size = 0;
    }

    /**
     * Lấy đối tượng MyLinkedListNode tại một chỉ số cụ thể.
     *
     * @param index Chỉ số cần truy cập.
     * @return MyLinkedListNode tại chỉ số cụ thể.
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    /**
     * Thêm một phần tử vào cuối danh sách.
     *
     * @param o Đối tượng cần thêm vào danh sách.
     */
    @Override
    public void add(Object o) {
        add(o, size);
    }

    /**
     * Thêm một phần tử vào danh sách tại một chỉ số cụ thể.
     *
     * @param o     Đối tượng cần thêm vào danh sách.
     * @param index Chỉ số cụ thể tại đây đối tượng sẽ được thêm vào.
     */
    @Override
    public void add(Object o, int index) {
        checkBoundaties(index, size);

        // Nếu danh sách rỗng hoặc phần tử sẽ được thêm vào đầu danh sách
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            // Nếu phần tử sẽ được thêm vào giữa hoặc cuối danh sách
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }

        size++;
    }

    /**
     * Xóa phần tử tại một chỉ số cụ thể.
     *
     * @param index Chỉ số của phần tử cần xóa.
     */
    @Override
    public void remove(int index) {
        checkBoundaties(index, size - 1);

        // Nếu phần tử cần xóa là phần tử đầu danh sách
        if (index == 0) {
            head = head.getNext();
        } else {
            // Nếu phần tử cần xóa nằm ở giữa hoặc cuối danh sách
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(current.getNext().getNext());
        }

        size--;
    }

    /**
     * Lấy phần tử tại một chỉ số cụ thể.
     *
     * @param index Chỉ số của phần tử cần lấy.
     * @return Đối tượng tại chỉ số cụ thể hoặc null nếu chỉ số không hợp lệ.
     */
    @Override
    public Object get(int index) {
        checkBoundaties(index, size - 1);
        MyLinkedListNode node = getNodeByIndex(index);
        return (node != null) ? node.getPayload() : null;
    }

    /**
     * Trả về số lượng phần tử trong danh sách.
     *
     * @return Số lượng phần tử trong danh sách.
     */
    @Override
    public int size() {
        return size;
    }
}
