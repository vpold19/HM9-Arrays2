public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        for (int i = 0; i < spendSalary.length; i++){
            total += spendSalary[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей",total);
    }
    private static void task2() {
        System.out.println("Задача 2");

    }
}