public class statementChecker
{
    public static void main(String[] args)
    {
        int x=8;
        int y=7;
        int z=9;

        if(x>y && x>z) //false
        System.out.println(x);
        else if(y>x && y>z)
        System.out.println(y);
        else
        System.out.println(z);
    }
}