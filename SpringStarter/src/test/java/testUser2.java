import java.sql.SQLException;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class testUser2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("whiteship");
		user.setName("하얀배");
		user.setPassword("whiteshipass");
		
		dao.add(user);
		
		System.out.println(user.getId() + "등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + "조회 성공");
	}
}
