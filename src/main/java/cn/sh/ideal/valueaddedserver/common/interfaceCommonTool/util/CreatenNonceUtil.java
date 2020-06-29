package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;



/**
 * 随机字符串生成类
 * ClassName:  CreatenNonceUtil <br/>
 * Function:  TODO ADD FUNCTION. <br/>
 * Reason:  TODO ADD REASON(可选). <br/>
 * date:  2018年6月8日 下午2:54:39 <br/>
 *
 * @author 振鹏
 * @version 
 */
public class CreatenNonceUtil {
	
	private static Logger log = LoggerFactory.getLogger(CreatenNonceUtil.class);

	/**
	 * 签名的随机字符串所包含的元素
	 */
	private static final String[] strs = new String[]
        {
         "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
         "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
         "@","#","$","%","^","-","+","|","shwxkf","1000","sh","cn","ideal",
         "0","1","2","3","4","5","6","7","8","9"
        };
	

	
	
	/**
	 *  签名的16位随机字符串
	 * @return
	 */
	public static String createnNonce_str(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        int length = strs.length;
        for (int i = 0; i <= 15; i++){
            sb.append(strs[r.nextInt(length - 1)]);
        }
        return sb.toString();
    }
	
	
	
	
	/**
	 * 
	 * numberOfDigits eg:(6位：100000)
	 * mathRandom: (根据numberOfDigits位数生成随机数). <br/>
	 * @author 振鹏
	 */
	public static String mathRandom(int numberOfDigits) {
		String mathRandomStr = String.valueOf((int) ((Math.random() * 9+1) * numberOfDigits));
		return mathRandomStr;
	}
	
	

}
