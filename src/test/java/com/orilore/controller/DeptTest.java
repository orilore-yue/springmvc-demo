package com.orilore.controller;

import javax.annotation.Resource;

import org.junit.Test;

import com.orilore.service.DeptService;

public class DeptTest extends BaseTest{
	@Resource
	private DeptService service;
	
	@Test
	public void testQuery() {
		this.service.findAll();
	}
}
