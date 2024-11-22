public class StringChecker{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the String ");
        String str = in.nextLine();
        System.out.println("The string entered is :"+str);
        boolean flag = false;
        if(!stringchecker(str)){
            System.out.println("The entered string is not perfect");
        }
        else{
            System.out.println("The entered string is perfect");
        } 
    }
    static boolean stringchecker( String s){
        Map<Character,Integer>charfreq = new HashMap<>();
        for(char c: s.toCharArray()){
            charfreq.put(c,charfreq.getOrDefault(c,0)+1);

        }
        for(Map.Entry<Character,Integer> entry: charfreq.entrySet()){
            if(entry.getValue()>1){
                return false;
            }
        }

        return true;
    }
}
