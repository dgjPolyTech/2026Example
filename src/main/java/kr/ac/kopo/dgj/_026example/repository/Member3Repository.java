package kr.ac.kopo.dgj._026example.repository;

import kr.ac.kopo.dgj._026example.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Entity 이름과 Repository 이름이 일치해야 함.
@Repository
public interface Member3Repository extends JpaRepository<Member3, Integer> {

}
