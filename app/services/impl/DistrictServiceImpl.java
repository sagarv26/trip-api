package services.impl;

import java.util.List;

import com.google.inject.Inject;

import dao.DistrictDAO;
import models.District;
import services.DistrictService;

public class DistrictServiceImpl implements DistrictService{
	
	private final DistrictDAO districtDao;

	@Inject
	public DistrictServiceImpl(DistrictDAO districtDao) {
		this.districtDao = districtDao;
	}

	@Override
	public List<District> getAllDistrict() {
		
		return districtDao.getAllDistrict();
	}

	@Override
	public List<District> getAllDistrictsOrder() {
		
		return districtDao.getAllDistrictsOrder();
	}

}
