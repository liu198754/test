import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

import java.lang.annotation.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import testp.eee;
import testp.ssss;
import testp.testd;

import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;




@yyyt(classType = YtsType.model)
public class jtest {

	public int sx = 3;
	@Deprecated
	private static void sayHello() {
	    System.out.println("Hello word !");
	}
	public static void main(String[] args) {
		sayHello();
		
		ssss qqq;
		ssss qqq12;
		
		try{
			jtest jts = new jtest();
			jts.sx = 10;
			Class<?> ss = Class.forName("jtest");
			Field fd = ss.getField("sx");
			//Object obj = ;
			int aa = fd.getInt(jts);
			int xx =1;
			yyyt ssq = ss.getAnnotation(yyyt.class);
			Annotation[] aaans = ss.getDeclaredAnnotations();
			Class aaa = jts.getClass();
		}
		catch(Exception e){
			
		}

		AAAA a = new AAAA(){
			@Override
			public void test(){
				
			}
			
			
		};
		
		BBBB b = new BBBB();
		
	     FileOutputStream fo;
		try {
			fo = new FileOutputStream("data.ser");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(a);
			
			//so.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	       
	        

		
		//new ObjectInputStream;
	}
	

	
	
}

class AAAA implements Serializable{
	public int x = 20;
	
	public AAAA() throws RuntimeException
	{
		throw new RuntimeException("sss");
	}
	
	public void test(){
		
	}
	
	public AAAA(BBBB b){
		this.x = b.y;
	}
}


class BBBB implements Serializable{
	public int y = 10;
	
	public BBBB(){
		
	}
}
