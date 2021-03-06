package home.Springboot.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import home.Springboot.Method.Security;

public interface SecurityRepository extends CrudRepository<Security , String> {
	//void delete(Security deleted);
	List<Security> findAll();
	List<Security> findByusername(String username);
	//Security save(Security save);
	List<Security> findByPassword(String password);
}
