public class forLoops 
{
    public static void main(String a[])
    {
        // for(int i=1; i<=4; i++)
        // for(int i=4; i>=1; i--)
        for(int i=0; i<4; i++)
        {
            System.out.println("Day " + i);

            for(int j=1; j<=9; j++)
            {
                System.out.println(" " + (j+8) + " - " + (j+9));
            }
        }
    }
}