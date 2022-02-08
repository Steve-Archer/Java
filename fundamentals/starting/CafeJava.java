package fundamentals.starting;
public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        double mochaPrice = 2.5;
        double dripPrice = 4.5;
        double lattePrice = 7.5;
        double cappuccinoPrice = 9.5;
    

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }else{
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(customer2 + displayTotalMessage + (lattePrice*2));
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            isReadyOrder2 = true;
        }else{
            System.out.println(customer2 + pendingMessage);
            isReadyOrder2 = false;
        }
        System.out.println(customer3 + displayTotalMessage + (lattePrice-dripPrice));
    }
}