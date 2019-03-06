package com.burning8393.cloud.microservicesimpleprovideruser.dao;

import com.burning8393.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository class
 *
 * @author : Pangxw
 * @date : 2019/3/2 11:13
 * @description :
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
