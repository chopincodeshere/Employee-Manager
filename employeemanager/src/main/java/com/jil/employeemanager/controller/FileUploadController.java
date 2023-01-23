package com.jil.employeemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jil.employeemanager.service.FileService;

@RestController
@RequestMapping("/employee")
public class FileUploadController {
	@Autowired
	private FileService fileService;
	
	@PostMapping("/upload-file") 
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile[] files) {
		for(MultipartFile file: files) {
			fileService.saveFile(file);
		}
		return ResponseEntity.ok("Working");
	}
}
