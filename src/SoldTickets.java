import java.util.*;

public class SoldTickets {

    private ArrayList<Ticket> soldTickets = new ArrayList<>();

    public void addTickets(Ticket ... tickets){
        soldTickets.addAll(Arrays.asList(tickets));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Collections.sort(soldTickets);
        for(Ticket ticket : soldTickets){
            stringBuilder.append(ticket.toString());
        }
        return stringBuilder.toString();
    }

    public HashMap<TicketType, Integer> amountOfDifferentTickets(){
        int preSaleAmount = 0;
        int preSaleStudentAmount = 0;
        int atTheDoorAmount = 0;
        for(Ticket ticket : soldTickets){
            if(ticket.getTicketType() == TicketType.DOOR)atTheDoorAmount++;
            else if(ticket.getTicketType() == TicketType.PRE_SALE)preSaleAmount++;
            else if (ticket.getTicketType() == TicketType.PRE_SALE_STUDENT)  preSaleStudentAmount++;
        }
        HashMap<TicketType, Integer> hashMap = new HashMap<>();
        hashMap.put(TicketType.DOOR, atTheDoorAmount);
        hashMap.put(TicketType.PRE_SALE, preSaleAmount);
        hashMap.put(TicketType.PRE_SALE_STUDENT, preSaleStudentAmount);
        return hashMap;
    }

    public String getAllStudentCards(){
        ArrayList<Integer> ids = new ArrayList<>();
        for(Ticket ticket : soldTickets){
            if(ticket instanceof PreSaleStudentTicket){
                ids.add(((PreSaleStudentTicket) ticket).getStudentCardId());
            }
        }
        Collections.sort(ids);
        StringBuilder stringWithIds = new StringBuilder();
        for(Integer i : ids){
            stringWithIds.append(i);
        }

        return stringWithIds.toString();
    }
}
