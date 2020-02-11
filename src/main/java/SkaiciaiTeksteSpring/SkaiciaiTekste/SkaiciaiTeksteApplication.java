package SkaiciaiTeksteSpring.SkaiciaiTekste;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

@SpringBootApplication
public class SkaiciaiTeksteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkaiciaiTeksteApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		SkaitymasIsFailo st = (SkaitymasIsFailo) context.getBean("skaitymas_is_failo");
		st.pradeti();
		ArrayList<String> zodziai = st.iMasyva();
		/*Iterator itr = zodziai.iterator();
		while(itr.hasNext()) {
			System.out.println ( itr.next());
		}
		SkaiciaiTeksteTvarkymas stt = (SkaiciaiTeksteTvarkymas) context.getBean( "mainspring" );
		stt.ieskotiSkaiciu();
		stt.parodytiSkaicius();
		stt.ieskotiVienetu();
		stt.parodytiVienetus();	
		stt.surasytiVntIrAnti();*/
	}

}
