package com.mvcConfig.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvcConfig.Modal.User;

@Repository
public interface userRepo extends JpaRepository<User, Integer> {
//	@Autowired
//	private HibernateTemplate hibertmep;
////	
//	public String SaveUser(User user) {
//		hibertmep.save(user);
//		return "Record Save Success!";
//	}

}
