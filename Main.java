public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi_index = service.calculate(180,77);
        System.out.println(bmi_index);
    }
}