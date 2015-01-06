package service;

import model.Captcha;
import model.Randomizer;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class CaptchaService {
    private Randomizer randomizer;

    public Captcha randomCaptcha() {
        return new Captcha(randomizer.getPattern(), randomizer.getOperand(), randomizer.getOperator(), randomizer.getOperand());
    }

    public void setRandomizer(Randomizer randomizer){
        this.randomizer = randomizer;
    }

}