package SeleniumAutomation.Demo;

import org.yaml.snakeyaml.Yaml;

public class YamlObjectMapper {

	/**
	 * It loads the yaml configuration as java pojo object. 
	 * @param filePath Path of the yaml test resource file.
	 * @param clazz Pojo class for the specified yaml configuration.  
	 * @return a pojo
	 */
	public Object yamlToJavaObject(String filePath, Class clazz)  {
	    return  new Yaml().loadAs( Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath), clazz);
	}

}
