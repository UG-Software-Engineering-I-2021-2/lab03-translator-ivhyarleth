import org.testng.Assert;
import org.testng.annotations.Test;

import translator.Translator;

public class Tests {
    @Test
    public void Test01() throws Exception{
        String fromLang = "en";
        String toLang = "es";
        String text = "Let's have some fun!";
        Assert.assertEquals(Translator.translate(fromLang, toLang, text), "¡Vamos a divertirnos un poco!");
    }
}