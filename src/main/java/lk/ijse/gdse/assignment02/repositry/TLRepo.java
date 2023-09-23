package lk.ijse.gdse.assignment02.repositry;

import lk.ijse.gdse.assignment02.entity.TL;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TLRepo extends JpaRepository<TL, UUID> {
}
