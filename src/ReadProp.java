import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadProp{
public Properties getDataProp() throws Exception{

		File f= new File("D:\\Nikhil\\vsts-agent-win7-x64-2.122.1\\_work\\1\\s\\info.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p= new Properties();
		p.load(fis);
		return p;
}
public Properties getPath() throws Exception{
	Properties p=getDataProp();
	File f= new File(p.getProperty("path"));
	FileInputStream fis = new FileInputStream(f);
	Properties p1= new Properties();
	p1.load(fis);
	return p1;
}
}
