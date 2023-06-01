package di.step2.dao;

import org.springframework.stereotype.Repository;

@Repository("tebero1")
public class TiberoDriver implements DataBaseDriver{

	@Override
	public void getConnection() {
		System.out.println("Tibero가 연결되었습니다.");
		
	}

}
