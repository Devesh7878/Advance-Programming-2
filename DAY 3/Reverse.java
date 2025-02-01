import java.util.Scanner;

class Reverse {
    public int reverse(int x) {
        int sum = 0;

        while (x != 0) {
            int y = x % 10;

            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && y > 7)) 
                return 0;
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && y < -8)) 
                return 0;

            sum = sum * 10 + y;
            x /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        
        Reverse obj = new Reverse();
        System.out.println(obj.reverse(x));
    }
}

