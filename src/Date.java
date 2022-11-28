public class Date {

    private int year;
    private int month;
    private int day;

    public Date() {
        /** sets to a default of 1/1/1970 */
        year = 1970;
        month = 1;
        day = 1;
    }

    //Assume the day starts and 1 month at 1 and year is four digits
    public Date(int year, int month, int day) {
        /** Initialize to the parameter dates */
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print() {
        /** print in date it the form day/month/year */
        System.out.println(day + "/" + month + "/" + year);
    }

}
