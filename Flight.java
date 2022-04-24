import java.util.Scanner;

public class Flight {

    boolean seats[];
    public Flight()
    {
        seats=new boolean[10];
        for(int i=0;i<seats.length;i++)
        {
            seats[i]=false;
        }
    }
    public boolean economyPresent()
    {
        for(int i=5;i<10;i++)
        {
            if(!seats[i])
            {
                return true;
            }
            
        }
        return false;

    }
    public boolean firstClassPresent()
    {
        for(int i=0;i<5;i++)
        {
            if(!seats[i])
            {
                return true;
            }
            
        }
        return false;

    }
    public int bookEconomy()
    {
        for(int i=5;i<10;i++)
        {
            if(!seats[i])
            {
                seats[i]=true;
                return i;
            }
            
        }
        return -1;
    }
    public int bookFirstClass()
    {
        for(int i=0;i<5;i++)
        {
            if(!seats[i])
            {
                seats[i]=true;
                return i;
            }
        }
        return -1;
    }

    public int assignSeat(int choice)
    {
        if(!economyPresent() && !firstClassPresent())
        {
            System.out.println("Sorry now seats left, Next Flight leaves after 3 hours");
            return -1;
        }

        if(choice==1)
        {
            int seat = bookFirstClass();
            if(seat==-1)
            {
                
                System.out.println("Is it acceptable for you to be placed in Economy(y/n) => ");
                char ch = new Scanner(System.in).next().charAt(0);
                if(ch=='y')
                {
                    seat = bookEconomy();
                    if(seat == -1)
                    {
                        System.out.println("Next flight leaves after 3 hours");
                    }
                }
            
            }
            return seat;
        }else if(choice==2)
        {
            int seat = bookEconomy();
            if(seat==-1)
            {
                System.out.println("Is it acceptable for you to be placed in First Class (y/n) => ");
                char ch = new Scanner(System.in).next().charAt(0);
                if(ch=='y')
                {
                    seat = bookFirstClass();
                    
                }
                else{
                    System.out.println("Next flight leaves after 3 hours");
                }
                
            }
            return seat;
        }
        return -1;
    }
    public static void boardingPass(String name, int seat)
    {
        System.out.println("Name : "+name);
        System.out.println("Seat Booked : "+(seat+1)+" ("+((seat>-1 && seat<5)?"First Class)":"Economy)"));
    }

    public static void main(String[] args) {
        Flight flight = new Flight();
        char restart;
        do{
            restart='n';
            System.out.println("Enter name : ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Please Type 1 for First Class\nPlease Type 2 for Economy\n Enter your Choice => ");
            int choice = new Scanner(System.in).nextInt();
            int seat = flight.assignSeat(choice);
            if(seat>-1)
            {
                System.out.println("Boarding Pass =>");
                Flight.boardingPass(name, seat);
            }
            System.out.println("Do you want to book again (y/n)");
            restart = new Scanner(System.in).next().charAt(0);
        }while(restart=='y');

    }
}
