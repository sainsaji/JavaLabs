import javafx.scene.effect.Light.Spot;

public class staticProgram {
    static int wattage;
    static int hashRate;
    static int electric_charge;
    static float coin_value;
    static int monthly_coin_rate;
    static String specs = "i7 11th gen 8gb ram RTX 3050";

    static {
        wattage = 500;
        hashRate = 1500;
        electric_charge = 1000;
        coin_value = 5000;
        monthly_coin_rate = 30;
    }

    static void specsDisplay() {
        System.out.println("System Specs are: \n" + specs);
        System.out.println("Current Hash Rate is: \n" + hashRate);
    }

    static class calculator {
        void calculation() {
            int total_charge = wattage * electric_charge * 12;
            System.out.println("Total charge for 1 year : " + total_charge);
        }
    }

    static class hashrate_calculator {
        void calculation() {
            float total_mined = coin_value * monthly_coin_rate * 12;
            System.out.println("Total coin value accumulated for 1 year : " + total_mined);
        }
    }

    public static void main(String args[]) {
        specsDisplay();
        staticProgram.calculator obj = new staticProgram.calculator();
        obj.calculation();
        staticProgram.hashrate_calculator hC = new staticProgram.hashrate_calculator();
        hC.calculation();
    }

}
