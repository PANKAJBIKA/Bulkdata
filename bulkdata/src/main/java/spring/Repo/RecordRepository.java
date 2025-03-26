package spring.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import spring.Entites.Records;
@EnableJpaRepositories
public interface RecordRepository extends JpaRepository<Records,Long > {

	//List<Records> saveAll(List<Records> records);

}
