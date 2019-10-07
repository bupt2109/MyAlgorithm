package bit;

/**
 * Created by lyx on 2019/10/7.
 */
public class BitUtil {

    public static boolean isPowerOf2(int num){
        return (num & num - 1) == 0;
    }


}
