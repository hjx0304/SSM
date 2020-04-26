package com.hjx.service;

import com.hjx.entity.TestBean;

import java.util.List;

public interface TestBeanService {

    public List<TestBean> queryAllByPages(int current,int pageSize);

    public int queryTotalPages(int pageSize);

    public TestBean queryById(int id);

    public void insert(TestBean testBean);

    public void delete(int id);

    public void update(TestBean testBean);
}
