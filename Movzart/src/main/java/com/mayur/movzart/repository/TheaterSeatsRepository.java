package com.mayur.movzart.repository;


import com.mayur.movzart.domain.TheaterSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeats, Long> {

}