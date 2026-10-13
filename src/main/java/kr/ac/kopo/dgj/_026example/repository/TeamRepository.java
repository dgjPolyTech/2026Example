package kr.ac.kopo.dgj._026example.repository;

import kr.ac.kopo.dgj._026example.domain.Player;
import kr.ac.kopo.dgj._026example.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
