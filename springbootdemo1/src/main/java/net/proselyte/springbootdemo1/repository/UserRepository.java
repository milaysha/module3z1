package net.proselyte.springbootdemo1.repository;

import net.proselyte.springbootdemo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
