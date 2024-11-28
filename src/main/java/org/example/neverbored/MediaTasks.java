package org.example.neverbored;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.Random;

@Component
public class MediaTasks {

    private static final int MAX_MEDIA_COUNT = 12;
    private final Random random = new Random();

    @Autowired
    private MediaDAO mediaDAO;

    @Scheduled(fixedRate = 5000)
    public void getMedia() {
        int randomID = random.nextInt(MAX_MEDIA_COUNT) + 1;
        Media media = mediaDAO.getMediaByID(randomID);
        System.out.println("Database ID: " + media.getId());
        System.out.println("Title of Media: " + media.getTitle());
        System.out.println("Media Type: " + media.getType());
        System.out.println("Check it out at: " + media.getLinkURL());
    }
}
