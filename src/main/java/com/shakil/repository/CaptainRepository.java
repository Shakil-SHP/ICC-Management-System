package com.shakil.repository;

import com.shakil.model.Captain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaptainRepository  extends JpaRepository<Captain, Long> {
}
