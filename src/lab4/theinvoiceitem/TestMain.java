package lab4.theinvoiceitem;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        InvoiceItem invoiceItem1 = new InvoiceItem("A101", "Pen Red", 888, 0.88);
        System.out.println(invoiceItem1);

        //Test setter and getter
        invoiceItem1.setQty(999);
        invoiceItem1.setUnitPrice(0.99);
        System.out.println(invoiceItem1);
        System.out.println(invoiceItem1.getId());
        System.out.println(invoiceItem1.getDesc());
        System.out.println(invoiceItem1.getQty());
        System.out.println(invoiceItem1.getUnitPrice());

        // Test getTotal()
        System.out.println(invoiceItem1.getTotal());
    }
}
