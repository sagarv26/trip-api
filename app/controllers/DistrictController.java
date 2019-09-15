package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.District;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.DistrictService;

public class DistrictController extends Controller{
	
	private final DistrictService districtService;

	public DistrictController(DistrictService districtService) {
		super();
		this.districtService = districtService;
	}
	
	public Result getAllDistricts() {
		System.out.println("Calling Controller");
        Map<String, Object> hashMap = new HashMap<>();
        List<District> district = districtService.getAllDistrict();
        hashMap.put("District",district);
        return ok(Json.toJson(hashMap));
    }
 	
	public Result getAllDistrictsOrder() {
        Map<String, Object> hashMap = new HashMap<>();
        List<District> district = districtService.getAllDistrictsOrder();
        hashMap.put("District", district);
        return ok(Json.toJson(hashMap));
    }
}
