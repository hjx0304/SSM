package com.hjx.dao;

import com.hjx.entity.TestBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TestBeanDao {

    @Select("select * from testBean")
    public List<TestBean> queryAll();

    @Select("select count(*) from testBean")
    public int queryTotalCount();

    @Select("select * from testBean where id=#{id}")
    public TestBean queryById(int id);

    @Insert("insert into testBean values(0,#{name})")
    public void insert(TestBean testBean);

    @Delete("delete from testBean where id=#{id}")
    public void delete(int id);

    @Update("update testBean set name=#{name} where id=#{id}")
    public void update(TestBean testBean);
}
