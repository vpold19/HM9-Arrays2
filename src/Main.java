public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] spendSalary = generateRandomArray();
        int total = 0;
        for (int i = 0; i < spendSalary.length; i++) {
            total += spendSalary[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", total);
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int arrMaximum = arr[0];
        int arrMinimum = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > arrMaximum) arrMaximum = arr[i];
            if (arr[i] < arrMinimum) arrMinimum = arr[i];
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей.",arrMinimum);
        System.out.println();
        System.out.printf("Максимальная сумма трат за день составила %d рублей",arrMaximum);
        System.out.println();
    }
    private static void task3(){
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double averegeSalaryDays = arr[0];
        int days = 30;
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            sum+=arr[i];
        }
       averegeSalaryDays = (double) sum / days;
        System.out.printf("Средняя сумма трат за месяц составила " + averegeSalaryDays + " рублей");
        System.out.println();
    }
    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i=reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
            if(i!=0);
            System.out.print(" ");
        }
        System.out.println();
    }
}
