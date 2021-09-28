package com.shakil.repository;

import com.shakil.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
//    User getMemberByUsername(String username);
//    User getUserById(Long id);
//    User getUserByEmail (String email);
}
