public class PreSaleTicket extends Ticket{

    private double price = 120;

    public double getPrice() {
        return price;
    }

    public PreSaleTicket(int id, TicketType ticketType, int daysBeforeEvent) {
        super(id, ticketType, daysBeforeEvent);
        getDiscount();
    }

    public void getDiscount(){
        if(super.getDaysBeforeEvent() > 10){
            this.price = price * 85 /100;
        }
    }

    @Override
    public String toString() {
        return  "PreSaleTicket{" + super.toString() +
                "price=" + price +
                '}';
    }
}
