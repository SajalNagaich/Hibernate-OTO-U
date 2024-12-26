package com.tcs.spring_boot_one_to_one_bi.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository  extends JpaRepository<Subject, Integer>{

}
