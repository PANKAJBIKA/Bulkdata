package spring.ServiceTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import spring.Entites.Records;
import spring.Repo.RecordRepository;
import spring.service.RecordService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class RecordServiceTest {
	  @Mock private RecordRepository repository;
	    @InjectMocks private RecordService service;

	    @Test
	    public void testSaveAll() {
	        List<Records> records = List.of(new Records(1L, "Test", "test@email.com"));
	        when(repository.saveAll(records)).thenReturn(records);

	        List<Records> savedRecords = service.saveAll(records);
	        assertEquals(1, savedRecords.size());
	

}}
