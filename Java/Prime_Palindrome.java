import java.util.Scanner;

public class Prime_Palindrome 
{
    public static boolean IsPrime(int num) 
    {
        if (num <= 1)
            return false;
        else if (num == 2)
            return true;
        else if (num % 2 == 0)
            return false;

        
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int CheckPalindrome(int j)
    {
        String strNum = Integer.toString(j);
        String reversed = new StringBuilder(strNum).reverse().toString();
        return strNum.equals(reversed) ? 1 : 0;
    }

    public static void main(String[] args) 
    {
        int[] L = new int[5] , U = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            L[i] = input.nextInt();
            U[i] = input.nextInt();
        }

        for(int i = 0; i < 5; i++)
        {
            int total = 0;
                    
            for(int j = L[i]; j <= U[i]; j++)
                if(IsPrime(j) == true) total += CheckPalindrome(j);

            System.out.println(total);
        }

    }    
}

