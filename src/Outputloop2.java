public class Outputloop2 {
public static void main(String[] args) {
        for (int cnt = 5; cnt >= 1; cnt--) {
            for (int cnt2 = 1; cnt2 <= cnt; cnt2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
