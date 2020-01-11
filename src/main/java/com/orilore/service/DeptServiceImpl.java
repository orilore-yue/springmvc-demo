package com.orilore.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.orilore.mapper.DeptMapper;
import com.orilore.model.Dept;

@Service
public class DeptServiceImpl implements DeptService{
	@Resource
	private DeptMapper mapper;
	@Override
	public List<Dept> findAll() {
		return this.mapper.select();
	}
	
}
