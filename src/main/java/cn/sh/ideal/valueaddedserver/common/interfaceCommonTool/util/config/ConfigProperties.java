package cn.sh.ideal.valueaddedserver.common.interfaceCommonTool.util.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *  服务启动，初始化读取公共配配置文件
 *  @author  振鹏  
 *  @ClassName  : ConfigProperties*  
 *  @Version  版本 *  
 *  @ModifiedBy 修改人 * 
 *  @Copyright  公司名称 * 
 *  @date  2018年8月23日 上午9:33:12
 */
@Component
public class ConfigProperties {

	private static final Logger logger = LoggerFactory.getLogger(ConfigProperties.class);

	private static Properties pro=new Properties();
	
	
	static{
		try {
			pro.load(new BufferedInputStream(ConfigProperties.class.getClassLoader().getResourceAsStream("interfaceCommon.properties")));
		} catch (IOException e) {
			logger.error("读取配置文件异常："+e);
		}
	}
	
	
	/**
	 * 根据properties配置文件中的key获取对应的值
	 * getProperty: (). <br/>
	 * @author 振鹏
	 * @param key
	 * @return
	 * @since JDK 1.8u171
	 */
	public static String getProperty(String key){
		try {
			if(pro.get(key)!=null){
				return (String)pro.get(key);
			}else{
				pro.load(new BufferedInputStream(ConfigProperties.class.getClassLoader().getResourceAsStream("interfaceCommon.properties")));
				if(pro.get(key)!=null){
					return (String)pro.get(key);
				}else{
					return null;
				}
			}
		} catch (Exception e) {
			logger.error("读取配置文件异常："+e);
		}
		return null;
	}
}
