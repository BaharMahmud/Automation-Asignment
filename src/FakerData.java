import com.github.javafaker.Faker;

public class FakerData {
    public static void main(String[] args) {
        Faker fakeData=new Faker();
        System.out.println(fakeData.address().city());
        System.out.println(fakeData.animal().name());
        System.out.println(fakeData.internet().emailAddress());
    }
}
