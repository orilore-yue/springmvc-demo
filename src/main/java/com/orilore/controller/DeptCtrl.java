package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orilore.model.Dept;
import com.orilore.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptCtrl {
	@Resource
	private DeptService service;

	@RequestMapping("/query.do")
	public String query(ModelMap model) {
		List<Dept> list = this.service.findAll();
		model.put("list", list);
		return "depts";
	}
}
