public class BmiService {
    public float calculate(float height,float weight) {
        float bmi_index = weight / (height * height / 100) * 100;
        return bmi_index;
    }
}
