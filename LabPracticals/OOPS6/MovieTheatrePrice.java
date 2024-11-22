public class MovieTheatrePrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of people attended the show");
        int people = in.nextInt();
        MovieTheatre mt = new MovieTheatre(people);
        System.out.println("The total income of the theatre is:"+mt.totalincome());
        System.out.println("The profit of the theatre owner is :"+mt.totalprofit());
    }
    
}
class MovieTheatre{
    int attendee;
    int ticket;
    double cost_attendee;
   protected MovieTheatre(int attendee){
    this.attendee = attendee;
    this.ticket = 5;
    this.cost_attendee = 0.5;
   }
  double totalincome()
{
    return  attendee*cost_attendee;
}
double totalprofit(){
    return totalincome() - 20;
}
}