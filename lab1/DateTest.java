class Date{
    public String month;
    public int day;
    public int year;
    public void displayDate(){
        System.out.println(month+"/"+day+"/"+year);
    }
}
public class DateTest{
    public static void main(String[] args) {
        Date date1,date2;
        date1= new Date();
        date1.month="March";
        date1.day=15;
        date1.year=2024;
        System.out.println("Date 1 is:");
        date1.displayDate();
        date2= new Date();
        date2.month="April";
        date2.day=10;
        date2.year=2025;
        System.out.println("Date 2 is:");
        date2.displayDate();
        
    }
}