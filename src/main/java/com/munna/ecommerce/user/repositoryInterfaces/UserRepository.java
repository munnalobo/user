package com.munna.ecommerce.user.repositoryInterfaces;

import com.munna.ecommerce.user.modelsAndEntities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
