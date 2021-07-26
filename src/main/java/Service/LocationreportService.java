//package Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import Model.LocationReport;
//import Repo.LocationRepo;
//
//public class LocationreportService {
//
//	@Autowired
//	LocationRepo locationrepo;
//
//	public List<LocationReport> getrport1(String locationname) {
//		List<LocationReport> locationreport= new ArrayList<>();
//		locationrepo.findByLocationName(locationname).forEach(locationreport::add);
//		return locationreport;
//	}
//
//}
