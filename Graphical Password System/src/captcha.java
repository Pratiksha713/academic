
import java.util.Random;

public class captcha {
	//public static void main(String a[])
	//{
		//System.out.println("captcha number:");
		//for(int i=0;i<5;i++) {
			//System.out.println(createCaptchaValue());
		//}
	//}
	public  String Createcaptchavalue() {
		Random random=new Random();
		int length=7 + ( Math.abs(random.nextInt())%3);
		StringBuffer captchaStrBuffer=new StringBuffer();
		for(int i=0;i<length; i++) {
			int baseCharacterNumber=Math.abs(random.nextInt())% 62;
			int characterNumber=0;
			if(baseCharacterNumber< 26) {
				characterNumber=65 +baseCharacterNumber;
			}
			else if(baseCharacterNumber<52) {
				characterNumber=97 +(baseCharacterNumber -26);
			}
			else {
				characterNumber=48 +(baseCharacterNumber - 52);
			}
			captchaStrBuffer.append((char)characterNumber);
		}
		return captchaStrBuffer.toString();
	
	}

	}
