public class DataMain {
    public static void main(String[] args) {
        Data data1 = new Data(2, 11, 2022);
        Data data2 = new Data(2, 11, 2022);

        System.out.println(data2.howManyDays(data1));
        System.out.println(data2.dayOfWeek(data1));

    }
}
