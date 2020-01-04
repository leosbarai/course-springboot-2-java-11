package br.com.leonardosbarai.course.repositories;

import br.com.leonardosbarai.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
