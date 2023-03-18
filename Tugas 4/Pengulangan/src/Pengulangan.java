public class Pengulangan {
    public static void main(String[] args) throws Exception {
        // Nomor 1
        System.out.print("1. ");
        for (int i = 1; i <= 13; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Nomor 2
        System.out.print("2. ");
        for (int i = 24; i >= 12; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Nomor 3
        System.out.print("3. ");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 8; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
        
        // Nomor 4
        System.out.println("4. ");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Nomor 5
        System.out.println("5. ");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j % 2 == 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // Nomor 6
        System.out.println("6. ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                if ((i + j) % 2 == 0) {
                    System.out.print("A ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}

