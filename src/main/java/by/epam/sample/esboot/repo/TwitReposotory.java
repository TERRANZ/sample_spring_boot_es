package by.epam.sample.esboot.repo;

import by.epam.sample.esboot.domain.Twit;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TwitReposotory extends ElasticsearchRepository<Twit, String> {
    List<Twit> findByText(String text);

    List<Twit> findByUserId(String uid);
}
