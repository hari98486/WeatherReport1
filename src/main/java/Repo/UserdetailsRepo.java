package Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Model.Userdetails;


@Repository
@Component
public interface UserdetailsRepo extends JpaRepository<Userdetails, Integer>{

}
