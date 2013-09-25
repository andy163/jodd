package props.jodd.com;

import java.io.File;
import java.io.IOException;

import jodd.props.Props;


public class Test {

	public static void main(String[] args) {
		final File confFile = new File(Test.getJarPath(), "vasmdb.properties"); 
		Props p = new Props();
		try {
			p.load(confFile);
			String s = p.getValue("db.url");
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取jar包所在目录。
	 * @return 返回jar包所在目录。
	 */
	public static File getJarPath() {
		File path = new File(Test.class.getProtectionDomain().getCodeSource().getLocation().getFile());
		if (path.getParentFile()!=null) {
			path = path.getParentFile();
		}
		return path;
	}
}
