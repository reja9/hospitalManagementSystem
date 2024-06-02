package com.hms.hospitalManagementSystem.Repositories;

import com.hms.hospitalManagementSystem.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {



}
