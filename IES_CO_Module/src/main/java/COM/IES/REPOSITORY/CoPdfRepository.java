package COM.IES.REPOSITORY;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import COM.IES.ENTITY.CoPdfs;

@Repository
public interface CoPdfRepository extends JpaRepository<CoPdfs, Serializable> {

}
