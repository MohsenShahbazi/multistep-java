package com.multistepapp.multistepapp.repository;
import com.multistepapp.multistepapp.entity.UserDataEntity;
import com.multistepapp.multistepapp.entity.UserDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<com.multistepapp.multistepapp.entity.UserDataEntity, Long> {
}
