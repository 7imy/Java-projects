public class Date{
    private int day;
    private int month;
    private int year;

    public Date(int day,int month, int year){
        this.day = day;
        this.month=month;
        this.year= year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public void setDay(int day){
        if(day>0&&day<=30){
            this.day = day;
        }
        else{
            day=0;
        }
    }
    public void setMonth(int month){
        if(month>=0 && month<=12){
        this.month = month;
        }
        else{
            month = 0;
        }

    }
    public void setYear(int year){
        this.year=year;
    }

    public void displayDate(){
        System.out.printf("%d/%d/%d\n,",getDay(),getMonth(), getYear());
    }
    
}