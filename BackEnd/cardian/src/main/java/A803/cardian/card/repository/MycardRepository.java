package A803.cardian.card.repository;

import A803.cardian.card.domain.MyCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MycardRepository extends JpaRepository<MyCard, Integer> {
    List<MyCard> findMyCardsByMemberId(int member_id);
}
