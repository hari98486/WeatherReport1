package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.LocationReport;

import Model.Userdetails;
import Repo.LocationRepo;
import Repo.UserdetailsRepo;

@RestController
@RequestMapping("/Admin")
public class AdminLocationControl {
	
	@GetMapping("/Addoperation")
	
	public String page()
	{
		return "<h1>Hi, Admin --Welcome To Weather Report Portal<h1>";
	}
	@Autowired
	LocationRepo locationrepo;
	@Autowired
	UserdetailsRepo user;
	
//	@Autowired
//	LocationReportService locationreportservice;
	
	//insertion
	@PostMapping("/operation")
	public LocationReport addreport(@Validated  @RequestBody LocationReport locationreport )
	{
		return locationrepo.save(locationreport);
	}
	//retrive
	@GetMapping("/operation")
	public List<LocationReport> getReport()
	{
	return locationrepo.findAll();
	}
	//retrivebyid
	@GetMapping("/operation/{location_id}")
	public Optional<LocationReport> getReport(@PathVariable Integer location_id)
	{
		
		return locationrepo.findById(location_id);
	}	
	//deletebyid
	@DeleteMapping("/operation/{location_id}")
	public String delete(@PathVariable Integer location_id)
	{
		locationrepo.deleteById(location_id);
		return "Succesfully Deleted";
	}
	//updatebyid
	@PutMapping("operation/{location_id}")
	public LocationReport update(@PathVariable Integer location_id, @Validated @RequestBody LocationReport locationreport)
	{
		if(locationrepo.findById(location_id).isPresent())
		{
			return locationrepo.save(locationreport);
		}
		return null;
	}
	
	//getallusersdetails
    @GetMapping("/userdata")
	
	public List<Userdetails> getReport2()
	{
		return user.findAll();
	}
}