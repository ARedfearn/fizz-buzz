import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void TestMain(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.Output(new PrintStream(out), 15);
        String s = out.toString().replaceAll("\\r\\n", "");
        Assert.assertEquals("12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz", s);
    }

}
