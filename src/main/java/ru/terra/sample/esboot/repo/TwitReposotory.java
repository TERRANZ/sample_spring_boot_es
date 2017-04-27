package ru.terra.sample.esboot.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ru.terra.sample.esboot.domain.Twit;

import java.util.List;

@Repository
public interface TwitReposotory extends ElasticsearchRepository<Twit, String> {
    List<Twit> findByText(String text);

    List<Twit> findByUserId(String uid);
}
