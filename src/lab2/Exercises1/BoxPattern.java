package lab2.Exercises1;

public class BoxPattern {
    public static void BoxPatternA(int size){
        for (int row = 1; row <= size ; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1||row == size || col == 1 || col == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternB(int size){
        for (int row = 1; row <= size ; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1||row == size || row == col ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternC(int size){
        for (int row = 1; row <= size ; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1||row == size || row + col == size + 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void BoxPatternD(int size){
        for (int row = 1; row <= size ; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1||row == size || row + col == size + 1|| row == col) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BoxPatternA(8);
        BoxPatternB(8);
        BoxPatternC(8);
        BoxPatternD(8);
    }
}
