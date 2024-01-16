package design.patterns.structural.facade.application;

import design.patterns.structural.facade.application.internal.AntiVirus;
import design.patterns.structural.facade.application.internal.BinaryCompressor;
import design.patterns.structural.facade.application.internal.FileCompressor;
import design.patterns.structural.facade.application.internal.ImageCompressor;
import design.patterns.structural.facade.application.internal.VideoCompressor;

import java.io.File;


public class FileUploader {
    public void upload(File file) throws Exception {
        AntiVirus.scan(file);

        FileCompressor fileCompressor = getFileCompressor(file);

        fileCompressor.compress(file);
    }

    private FileCompressor getFileCompressor(File file) {
        FileCompressor fileCompressor;

        if(isImage(file)) {
            fileCompressor = new ImageCompressor();
        } else if(isVideo(file)) {
            fileCompressor = new VideoCompressor();
        } else {
            fileCompressor = new BinaryCompressor();
        }

        return fileCompressor;
    }

    private boolean isImage(File file) {
        return true;
    }

    private boolean isVideo(File file) {
        return true;
    }
}
