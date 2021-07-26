package Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Model.LocationReport;

@Repository
@Component
public interface LocationRepo extends JpaRepository<LocationReport, Integer>{

//	List<LocationReport> findByLocationName(String name);
}
