public class logicalop
{
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a > b ;
        System.out.println(result);
    }

}


// & T T -> T, T F -> F, F T -> F, F F -> F
// | T T -> T, T F -> T, F T -> T, F F -> F