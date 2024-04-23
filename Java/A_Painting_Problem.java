import java.util.Scanner;

public class A_Painting_Problem
{
    public static void main(String[] args) 
    {
        String string = "";
        String array[] = new String[3];
        int M = 0, N = 0, K = 0;
        double binaryM[] = new double[200], binaryN[] = new double[200];
        Scanner input = new Scanner(System.in);

        int purple = 0, blue = 0;

        //Input
        string = input.nextLine();
        array = string.split(" " , 3);
        for(int j = 0 ; j < array.length ; j++)
        {
            //N -> M -> K
            if(N == 0)
            {
                N = Integer.parseInt(array[j]);
            }
            else if(M == 0)
            {
                M = Integer.parseInt(array[j]);
            }
            else if(K == 0)
            {
                K = Integer.parseInt(array[j]);
            }
        }
        
        
        //Process
        
        //Change N to binary
        double n = N;
        int j = 0;
        while(n > 0)
        {
            binaryN[j] = (n % 2);
            if(n % 2 == 1)
            {
                n = (n / 2) - 0.5;
            }
            else
            {
                n = n / 2;
            }
            j++;
        }

        //Change M to binary
        double m = M;
        j = 0;
        while(m > 0)
        {
            binaryM[j] = (m % 2);
            if(m % 2 == 1)
            {
                m = (m / 2) - 0.5;
            }
            else
            {
                m = m / 2;
            }
            j++;
        }
        
        //Comparison
        for(int ia = 0; ia < K; ia++)
        {
            if(binaryM[ia] == binaryN[ia])
            {
                purple += 1;
            }
            else
            {
                blue += 1;
            }
        }

        System.out.println(blue + " " + purple);
    }
}