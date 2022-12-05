package random.shterneregen.bootjwth2.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import random.shterneregen.bootjwth2.model.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}
