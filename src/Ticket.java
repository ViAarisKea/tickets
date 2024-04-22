public class Ticket implements Comparable<Ticket>{

    private int id;
    private TicketType ticketType;
    private int daysBeforeEvent;

    public Ticket(int id, TicketType ticketType, int daysBeforeEvent) {

        this.id = id;
        this.ticketType = ticketType;
        this.daysBeforeEvent = daysBeforeEvent;
    }

    @Override
    public int compareTo(Ticket ticket) {
        return Integer.compare(id, ticket.getId());
    }


    public int getId() {
        return id;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public int getDaysBeforeEvent() {
        return daysBeforeEvent;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                ", id=" + id +
                ", ticketType=" + ticketType +
                '}';
    }
}
