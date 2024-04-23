import java.util.Scanner; 

public class The_Empire_Strikes_Back 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(), M = input.nextInt();
        int total = 0;

        for(int i = 0; i < N; i++)
        {
            int W = input.nextInt();

            if(W <= M)
                total += W;
        }

        System.out.println(total);
    }    
}
