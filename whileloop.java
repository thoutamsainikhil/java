    public class whileloop 
        {
        public static void main(String[] args)
            {
            int i = 1;

            while(i<=10)  // whileloop
                {
                System.out.println("Hi " + i);
                int j =1;
                while(j<=3)              //nestedwhileloop!
                    {
                    System.out.println("Hello " + j);
                    j++;
                    }
                i++;
                }
            System.out.println("Bye " + i);
            }
        }
