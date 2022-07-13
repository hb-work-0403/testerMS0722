package com.sb.testerMS0722.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.testerMS0722.db.entity.EmployeeE;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeE, Integer>{


	
}
