public class PreSaleStudentTicket extends Ticket{
    private int studentCardId;
    private double price = 90;

    public PreSaleStudentTicket(int id, TicketType ticketType, int daysBeforeEvent, int studentCardId) {
        super(id, ticketType, daysBeforeEvent);
        this.studentCardId = studentCardId;
        getDiscount();
    }

    public int getStudentCardId() {
        return studentCardId;
    }

    public double getPrice() {
        return price;
    }

    public void getDiscount(){
        if(super.getDaysBeforeEvent() > 10){
            this.price = price * 85 / 100;
        }
    }

    @Override
    public String toString() {
        return "Remember to bring the student card!" + super.toString() +
                "studentCardId=" + studentCardId +
                "price=" + price +
                '}';
    }
}
