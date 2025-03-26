package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.Entites.Records;
import spring.Repo.RecordRepository;

@Service
public class RecordService {
	@Autowired
     RecordRepository repository;

    public List<Records> saveAll(List<Records> records) {
        return repository.saveAll(records);
    	
    }

    public List<Records> getAll() {
        return repository.findAll();
    }
}
