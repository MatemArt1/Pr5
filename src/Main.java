import java.util.HashSet;
public class Main {
    /*
    Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).


     */
    public static int findIt(int[] a) {
        HashSet<String> set = new HashSet<String>();
        String[] b = new String[a.length];
        for(int i = 0; i < a.length; i++)
        {
            b[i] = Integer.toString(a[i]);
        }
        set.add(b[0]);
        for(int i = 1; i < a.length; i++)
        {
            if(set.add(b[i]))
            {
                set.add(b[i]);
            }
            else
            {
                set.remove(b[i]);
            }
        }
        int odd = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(set.add(b[i]))
                set.remove(b[i]);
            else
                return a[i];
        }
        return odd;
    }
    public static void main(String[] args) {
    }
}