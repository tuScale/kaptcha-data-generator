package ro.tuscale.kaptcha;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

public class KaptchaRunner {
       public static void main(String args[]) {
        Properties props = new Properties();
	Producer kaptchaProducer;
	String capText;
	BufferedImage bi;

	// Fill in with sufficient properties to get this running
	props.put("kaptcha.producer.impl", "com.google.code.kaptcha.impl.DefaultKaptcha");
	props.put("kaptcha.textproducer.impl", "com.google.code.kaptcha.text.impl.DefaultTextCreator");
	props.put("kaptcha.producer.impl", "com.google.code.kaptcha.impl.DefaultKaptcha");

	Config config = new Config(props);
	kaptchaProducer = config.getProducerImpl();
	capText = kaptchaProducer.createText();
	bi = kaptchaProducer.createImage(capText);
	try {
	   ImageIO.write(bi, "jpg", new File("out.jpg"));
        } catch(IOException ex) {}
	System.out.println("Done!");
   }
}
