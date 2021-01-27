package jerry;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Tpday s our lucky day!";
    }
}
