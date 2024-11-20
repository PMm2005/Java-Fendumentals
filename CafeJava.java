public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 3;
        double latte = 2.5;
        double cappuccino = 3;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2= "Sam";
        String customer3= "Jimmy";
        String customer4="Noah";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrfder3 = false;
        boolean isReadyOrfder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	if (isReadyOrder1){
            System.out.println(readyMessage + customer1);
        } else {
            System.out.println(pendingMessage + customer1);
        }

        //Noah
        System.out.println(generalGreeting + customer4);
        if (isReadyOrfder4) {
            System.out.println(readyMessage + customer4);
            System.out.println(displayTotalMessage + cappuccino);
        }else{
            System.out.println(pendingMessage + customer4);
        }

        //Sam
        double samTotal = latte * 2;
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(readyMessage + customer2);
            System.out.println(displayTotalMessage + samTotal);
        }else{
            System.out.println(pendingMessage + customer2);
        }

        //Jimmy
        double coffeePrice = dripCoffee;
        double jimmyTotal = latte - coffeePrice;
        System.out.println(displayTotalMessage + jimmyTotal);
    }
}
