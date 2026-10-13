package kr.ac.kopo.dgj._026example.repository;

import jdk.jfr.Registered;
import kr.ac.kopo.dgj._026example.domain.Product2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product2Repository extends JpaRepository<Product2, Integer> {

}
