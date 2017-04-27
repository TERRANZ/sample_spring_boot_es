package ru.terra.sample.esboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.terra.sample.esboot.domain.Twit;
import ru.terra.sample.esboot.repo.TwitReposotory;

import java.util.List;

@Service
public class TwitService {
    @Autowired
    private TwitReposotory reposotory;

    public Twit findById(String id) {
        return reposotory.findOne(id);
    }

    public Twit save(Twit twit) {
        return reposotory.save(twit);
    }

    public void deleteAll() {
        reposotory.deleteAll();
    }

    public List<Twit> findByText(String text) {
        return reposotory.findByText(text);
    }

    public List<Twit> findByUserId(String uid) {
        return reposotory.findByUserId(uid);
    }
}
