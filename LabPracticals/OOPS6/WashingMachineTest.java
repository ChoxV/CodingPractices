public class WashingMachineTest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the value of clothes to be entered in the washing machine:");
        int clothes= in.nextInt();
        WashingMachine wm = new WashingMachine(clothes);
        System.out.println("The washing machine is turned on:"+wm.switchOn());
        System.out.println("The clothes has been accepted by the clothes:"+wm.acceptClothes(clothes));
        System.out.println("The washing machine is witched off:10"+wm.switchOff());
        
    }
}
class WashingMachine{
    int no_of_clothes;
    WashingMachine(int no_of_clothes){
        this.no_of_clothes = no_of_clothes;
    }
   boolean switchOn(){
        return true;
   }
   boolean switchOff(){
    return false;
   }
   int acceptClothes(int no_of_clothes){
    if(no_of_clothes>10){
        return 0;
    }
    return no_of_clothes;
   }

}