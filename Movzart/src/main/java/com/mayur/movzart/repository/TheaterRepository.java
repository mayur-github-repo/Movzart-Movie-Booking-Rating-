package com.mayur.movzart.repository;


import com.mayur.movzart.domain.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

}