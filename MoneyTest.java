import Money;

public class MoneyTest {
    public static void main(String[] args) {
        int i = 10;
        short sh = 100;
        long l = 100;
        double d = 100.0;
        float f = 100.0;
        Money iM = new Money(i);
        System.out.println("iM: " + iM.toString());
        System.out.println("iMi: " + iM.intValue().toString());
        Money shM = new Money(sh);
        System.out.println("shM: " + shM.toString());
        System.out.println("shMsh: " + shM.intValue().toString());
        Money dM = new Money(d);
        System.out.println("dM: " + dM.toString());
        System.out.println("dMd: " + dM.intValue().toString());
        Money fM = new Money(f);
        System.out.println("fM: " + fM.toString());
        System.out.println("fMf: " + fM.intValue().toString());
        
    }
}
