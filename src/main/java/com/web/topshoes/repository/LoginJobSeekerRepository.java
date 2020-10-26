package com.web.topshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.topshoes.entity.LoginEntity;
@Repository
public interface LoginJobSeekerRepository extends JpaRepository<LoginEntity, Long> {

	@Query(value="select * from login_tbl where email=:email and password=:pass",nativeQuery=true)
	LoginEntity findByEmailAndPassword(String email, String pass);

}
