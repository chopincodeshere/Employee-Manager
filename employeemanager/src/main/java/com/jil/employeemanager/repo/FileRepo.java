package com.jil.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jil.employeemanager.model.FileDB;

@Repository
public interface FileRepo extends JpaRepository<FileDB, Integer> {}
