package Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.LocationReport;
import Model.Userdetails;
import Repo.LocationRepo;
import Repo.UserdetailsRepo;


@RestController
@RequestMapping("/User")
public class UserLocationControl {
	
	@Autowired
	LocationRepo locationrepo;
	
	@GetMapping("/Home")
	public String Home()
	{
		return "Welocome to Home";
	}
	@GetMapping("/weatherreport/{location_id}")
	public Optional<LocationReport> getReport(@PathVariable Integer location_id)
	{
	return locationrepo.findById(location_id);
	}
	@Autowired
	UserdetailsRepo user;
//	
//	@Autowired
//	LocationreportService Locationreportservice;
//	@GetMapping("/h/{id}")
//	public List<LocationReport> getreports1(@PathVariable String id)
//	{
//		
//		return Locationreportservice.getrport1(id);
//				
//	}
}
