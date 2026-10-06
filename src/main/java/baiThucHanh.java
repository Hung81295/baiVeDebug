import java.util.function.DoubleBinaryOperator;

public class baiThucHanh {
    public static double withdaw(double balance, double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền rút phải lớn hơn 0");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Số du không đủ");
        }
        double newBalance = balance - amount;
        return newBalance;
    }

    public static void main(String[] args) {
        double balance = 500000;
        double amount = -100000;
        try {
            double newBalance = withdaw(balance, amount);
            System.out.println("Số dư còn lại: " + newBalance);
        }catch (IllegalArgumentException e) {
            System.out.println("Lỗi: "+e.getMessage());
        }finally {
            System.out.println("Giao dịch kết thúc");
        }
        }
    }



