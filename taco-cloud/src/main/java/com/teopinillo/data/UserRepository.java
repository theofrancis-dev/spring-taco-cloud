package com.teopinillo.data;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.teopinillo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username); //auto generated by spring

}
