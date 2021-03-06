package wrapper;

/**
 * Author:ZJF
 * Date:2021-03-12 下午7:16
 */
public class WrapperExercise {
    public static void main(String[] args) {

        //不是同一个对象，因为 new 一定是开新的对象空间
        Integer integer = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(integer == integer2);//false

        //自动装箱 Integer.valueOf(1)
        Integer a1 = 1;
        Integer a2 = 1;
        System.out.println(a1 == a2); //false

        //int -128~127、因此new
        Integer m1 = 128;
        Integer m2 = 128;
        System.out.println(m1 == m2);//false


        // 1.如果 是 -128 到 127 是从  IntegerCache.cache 数组中获取
        // 2.如果不在这个范围，就new
        // low -128 high 127 cache[-128,127]
        /**
         *  public static Integer valueOf(int i) {
         *             if (i >= IntegerCache.low && i <= IntegerCache.high)
         *                 return IntegerCache.cache[i + (-IntegerCache.low)];
         *             return new Integer(i);
         *         }
         *
         *
         */
    }
}
