package lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 123;
        var b = "what is it";
        lesson2 lesson2 = new lesson2();
        lesson2.setInt1(7);
        lesson2.setByte1((byte) 127);
        lesson2.setShort1((short)32177);
        lesson2.setLong1(987654321);
        lesson2.setFloat1(1.2f);
        lesson2.setBoolean1(false);
        lesson2.setStr("what is it");
        lesson2.setInt2(-7);
        lesson2.setByte2((byte)-127);
        lesson2.setLong2(-987654321l);
        lesson2.setShort2((short)-32177);
        lesson2.setFloat2(-1.2f);
        lesson2.setBoolean2(false);
        lesson2.setDouble2(12.12);
        lesson2.setChar2('9');
        System.out.println(lesson2.getInt1());
        System.out.println(lesson2.getByte1());
        System.out.println(lesson2.getShort1());
        System.out.println(lesson2.getLong1());
        System.out.println(lesson2.getFloat1());
        System.out.println(lesson2.isBoolean1());
        System.out.println(lesson2.getStr());
        System.out.println(a);
        System.out.println(b);
        System.out.println(lesson2.getInt2());
        System.out.println(lesson2.getByte2());
        System.out.println(lesson2.getLong2());
        System.out.println(lesson2.getShort2());
        System.out.println(lesson2.getFloat2());
        System.out.println(lesson2.getBoolean2());
        System.out.println(lesson2.getDouble2());
        System.out.println(lesson2.getChar2());
    }
}
