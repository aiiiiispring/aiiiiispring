package com.myself.file;

import lombok.AllArgsConstructor;
import org.dromara.x.file.storage.core.FileInfo;
import org.dromara.x.file.storage.core.FileStorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author aiiiiii
 * @CreateTime:2024/07/02/17:21
 */
@RestController
@RequestMapping("/file")
@AllArgsConstructor
public class FileUploadController {

    private final FileStorageService fileStorageService;

    @PostMapping("/upload")
    public FileInfo upload(@RequestParam("file") MultipartFile file) {
        return fileStorageService.of(file).upload();
    }
}
