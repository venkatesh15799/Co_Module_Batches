package COM.IES.REPOSITORY;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import COM.IES.ENTITY.CoTriggers;

@Repository
public interface CoTriggersRepository extends JpaRepository<CoTriggers, Serializable> {

}
