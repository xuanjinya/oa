package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * @Author: Yaking
 * @Date: 2019-07-17 23:03
 * @Describe:
 */
@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);

    void update(Department department);

    void delete(String sn);

    Department select(String sn);

    List<Department> selectAll();
}
