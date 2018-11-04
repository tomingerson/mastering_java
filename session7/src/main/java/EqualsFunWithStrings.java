

/**
 * @author Created by ergouser on 16.10.18.
 */
public class EqualsFunWithStrings {

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "A" + "BC";
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = "A" + s3.substring(1, 3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        String s5 = ("A" + s3.substring(1, 3)).intern();
        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));
    }

}
