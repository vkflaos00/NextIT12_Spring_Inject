package di.step2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.step2.dao.DataBaseDriver;
import di.step2.dao.MysqlDriver;
import di.step2.dao.OracleDriver;
import di.step2.service.FreeBoardService;
import di.step2.service.MemberService;

public class NextITProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DataBaseDriver driver = new OracleDriver();
		//DataBaseDriver driver = new MysqlDriver();
		
		
		ApplicationContext context 
			= new GenericXmlApplicationContext("spring/step2.xml"); 
				
		
		
		//글쓰기처리
		//FreeBoardService free = new FreeBoardService(driver);
		FreeBoardService free =
				context.getBean(FreeBoardService.class);	
		free.insertBoard();
		
		MemberService member 
			= context.getBean(MemberService.class);
		member.insertMember();
		
	}

}
