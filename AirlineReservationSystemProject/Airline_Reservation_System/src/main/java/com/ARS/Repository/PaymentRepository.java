package com.ARS.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ARS.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long>{

}
