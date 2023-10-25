package com.mayur.movzart.repository;


import com.mayur.movzart.domain.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatsRepository extends JpaRepository<ShowSeat, Long> {

}