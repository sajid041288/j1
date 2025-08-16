public class Butterfly {
    public static void star(int row)
    {
        for (int i=1;i<=row;i++)
        {
            for(int j=1;j<=2*row; j++)
            {
                if(j>i && j<=2*row -i)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();}
    }

    public static void main(String[] args) {
       int row = 5;
       star(row);
    }
}