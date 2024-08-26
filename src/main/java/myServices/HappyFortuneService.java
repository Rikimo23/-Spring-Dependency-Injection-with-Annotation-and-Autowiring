package myServices;

import org.springframework.stereotype.Component;

public class HappyFortuneService {@Component
public class HappyFortune implements FortuneServices {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}


}
