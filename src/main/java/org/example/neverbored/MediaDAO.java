package org.example.neverbored;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional

public class MediaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Media getMediaByID(int id) {
        return entityManager.find(Media.class, id);
    }

    public void createMedia(Media media) {
        entityManager.persist(media);
    }

    public Media updateMedia(Media media) {
        entityManager.merge(media);
        return media;
    }

    public Media deleteMedia(int id) {
        Media media = entityManager.find(Media.class, id);
        entityManager.remove(media);
        return media;
    }
}