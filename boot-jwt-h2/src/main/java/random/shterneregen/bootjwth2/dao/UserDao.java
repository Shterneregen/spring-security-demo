package random.shterneregen.bootjwth2.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import random.shterneregen.bootjwth2.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {

	DAOUser findByUsername(String username);

}
