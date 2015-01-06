package service;

import model.Captcha;
import model.Randomizer;
import org.junit.Test;
import service.CaptchaService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by cadet on 1/6/15 AD.
 */
public class CaptchaServiceTest {


    public Randomizer getRangdomizer()  {
        Randomizer random = mock(Randomizer.class);
        when(random.getOperand()).thenReturn(1);
        when(random.getOperator()).thenReturn(1);
        when(random.getPattern()).thenReturn(1);

        return random;
    }

    @Test
    public void getCaptchaStringShouldBe1PlusOne(){

        CaptchaService captchaService = new CaptchaService();

        Randomizer randomizer = getRangdomizer();

        captchaService.setRandomizer(randomizer);

        Captcha captcha = captchaService.randomCaptcha();

        assertEquals("1 + One", captcha.toString());
    }
}
