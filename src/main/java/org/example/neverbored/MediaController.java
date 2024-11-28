package org.example.neverbored;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class MediaController {

    @Autowired
    private MediaDAO mediaDAO;

    @RequestMapping(value="/getMedia/{id}", method=RequestMethod.GET)
    public Media getMedia(@PathVariable int id) {
        return mediaDAO.getMediaByID(id);
    }

    @RequestMapping(value="/addMedia", method=RequestMethod.POST)
    public Media addMedia(@RequestBody Media media) throws IOException {
        mediaDAO.createMedia(media);
        return media;
    }

    @RequestMapping(value="/updateMedia", method=RequestMethod.POST)
    public Media updateMedia(@RequestBody Media media) throws IOException {
        return mediaDAO.updateMedia(media);
    }

    @RequestMapping(value="/deleteMedia/{id}", method=RequestMethod.DELETE)
    public Media deleteMedia(@PathVariable int id) throws IOException {
        return mediaDAO.deleteMedia(id);
    }
}