package COM.IES.REPOSITORY;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRunDatailsRepository extends JpaRepository<BatchRunDatailsRepository, Serializable> {

}
