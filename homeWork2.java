import java.util.Scanner;

public class homeWork2 {
    public static int  taxEarning(int  earnings){
        int tax = (earnings / 100) * 6;
        return tax; 
    }

   
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int taxableIncome = earnings - spendings;
        if (taxableIncome > 0) {
            return (taxableIncome / 100) * 15;
        } else {
            return 0; // Если доходов нет или расходы превышают доходы, налог нулевой
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0; //доходы
        int spendings = 0; //расходы

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            System.out.println("end <Enter>");
            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                System.out.println("Введите сумму доходов: ");
                String moneyStr = scanner.nextLine(); 
                int money = Integer.parseInt(moneyStr);
                earnings += money;
                break;
                case 2:
                System.out.println("Введите сумму расходов: ");
                String expensesStr = scanner.nextLine(); 
                int expenses = Integer.parseInt(expensesStr);
                earnings += expenses;
                break;
                case 3:
                int tax1 = taxEarning(earnings);
                int tax2 = taxEarningsMinusSpendings(earnings, spendings);

                if(tax1 < tax2){
                    System.out.println("Мы советуем вам УСН доходы");
                    System.out.println("Ваш налог составит: " + tax1 + "руб");
                    System.out.println("Налог на другой системе: " + tax2 + "Руб");
                    System.out.println("Экономия: " + (tax2 - tax1) + "руб");
                } else if(tax2 < tax1) {
                    System.out.println("Мы советуем вам УСН доходы минус расходы");
                    System.out.println("Ваш налог составит: " + tax2 + "руб");
                    System.out.println("Налог на другой системе: " + tax1 + "Руб");
                    System.out.println("Экономия: " + (tax1 - tax2) + "руб");
                } else {
                    System.out.println("Можете выбрать любую систему налогооблажения");
                    System.out.println("Налог в обоих случаях: " + tax1 + "руб");
                }
                break;
                default:
                 System.out.println("Нет такой операции");
            }
       }

       System.out.println("Программа завершена!");
            
    }


}
