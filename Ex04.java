// 4) Print odd numbers between 1 to 20

public class Ex04 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}