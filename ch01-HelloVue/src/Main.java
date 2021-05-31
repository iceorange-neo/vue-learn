/**
 * @author neo
 * @date 2021/5/29
 * @time 17:00
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Vue...");
        int i = 4567;
        Integer ii = new Integer(4567);
        System.out.println(i == ii);    // Integer类型和int类型==比较会自动拆箱

        Integer integer1 = new Integer(125);
        Integer integer2 = new Integer(125);
        System.out.println(integer1 == integer2);   // false??   new了两次   堆中不同的对象

        Integer in = 124;
        Integer on = 124;
        System.out.println(in == on);   // 自动拆箱比较

        Integer ll = 128;
        Integer oo = 128;
        System.out.println(ll == oo);   // 不在数字常量池中
    }
}
