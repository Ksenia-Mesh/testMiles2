public class Main {
    public static void main(String[] args) {

        int ticketPrice = 200;
        int milesPrice = 20;

        int miles;
        if (ticketPrice < 0) {
            System.out.println("Неверно указана стоимость билета");
        } else {
            miles = ticketPrice / milesPrice;
            System.out.println("Количество начисленных миль: " + miles);
        }
    }
}
