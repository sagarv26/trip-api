package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.inject.Inject;
import models.District;

public class DistrictDAO extends BaseDao{

	@Inject
	public DistrictDAO() {
		super();
	}
	
	
     public List<District> getAllDistrict() {
    	 List<District> districtList = new ArrayList<>();
    	 
    	 try {
    	 districtList = db.find(District.class).findList();
    	 }
    	 catch(Exception ex){
    		System.out.println(ex); 		
    	 }
    	 return districtList;
     }
     
     public List<District> getAllDistrictsOrder() {
	       
	        List<District> districtList = db.find(District.class).findList();
	        Collections.sort(districtList, new DistrictComparator() );
	        return districtList;
	 }
}
