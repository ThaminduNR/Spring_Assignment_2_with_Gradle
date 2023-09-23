package lk.ijse.gdse.assignment02.repositry;

import lk.ijse.gdse.assignment02.entity.TL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface TLRepo extends JpaRepository<TL, UUID> {
}
