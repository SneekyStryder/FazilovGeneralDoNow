//Try it out in this runner
public class DateRunner
{
    public static void main(String[] args)
    {
//1. Construct the object defaultDate and then use print() to see if it’s working
        Date defaultDate = new Date();
        defaultDate.print();
//2. Construct the object myFavoriteDate with the date of your choice and then use print() to see if it’s working.
        Date myFavoriteDate = new Date(1717, 17, 17);
        myFavoriteDate.print();

        System.out.println(defaultDate);
        System.out.println(myFavoriteDate);

    }
}
