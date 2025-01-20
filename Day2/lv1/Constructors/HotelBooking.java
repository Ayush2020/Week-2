public class HotelBooking{
    private String guestName ;
    private String roomType;
    private int nights;
    //DEfault COnstructor

    public HotelBooking(){
        System.out.println("Default Constructor ");
    }
    //Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy Constructor
    public HotelBooking(HotelBooking clone){
        this.guestName = clone.guestName;
        this.roomType = clone.roomType;
        this.nights = clone.nights;
    }

//    getter method
    public String getGuestName(){
        return guestName;
    }
    public String getRoomType(){
        return roomType;
    }
    public int getNights(){
        return nights;
    }

    //Setter method
    public void setGuestName(String guestName){
        this.guestName = guestName;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public void setNights(int nights){
        this.nights = nights;
    }

    @Override
    public String toString(){
        return "GuestName : " + guestName + "\nRoomType: " + roomType + "\nNights: " + nights ;
    }

    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();
        HotelBooking booking1 = new HotelBooking("Raj","AC",  3);
        HotelBooking bookking2 = new HotelBooking(booking1);

        System.out.println(booking1);
        System.out.println(bookking2);
    }

}