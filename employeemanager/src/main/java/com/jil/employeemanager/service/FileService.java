package com.jil.employeemanager.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jil.employeemanager.model.FileDB;
import com.jil.employeemanager.repo.FileRepo;

@Service
public class FileService {
	@Autowired
	private FileRepo fileRepo;
	
	public FileDB saveFile(MultipartFile file) {
		String filename = file.getOriginalFilename();
		
		try {
			FileDB doc = new FileDB(filename, file.getContentType(), file.getBytes());
			return fileRepo.save(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Optional<FileDB> getFile(Integer id) {
		return fileRepo.findById(id);
	}
}
