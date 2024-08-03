package com.stream.app.services;


import com.stream.app.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {
    Video save(Video video, MultipartFile file);
    Video getVideoById(String videoId);
    Video getByTitle(String title);
    List<Video> getAll();
}
