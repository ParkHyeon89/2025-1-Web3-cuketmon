package cuketmon.trainer.repository;

import cuketmon.trainer.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, String> {
     List<Trainer> findTop5ByOrderByWinDesc(); // 승리 수 기준 내림차순 상위 5명
    }
}
