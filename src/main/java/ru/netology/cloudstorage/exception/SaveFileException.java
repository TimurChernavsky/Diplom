package ru.netology.cloudstorage.exception;

import java.io.IOException;

public class SaveFileException extends RuntimeException{
    public SaveFileException(String cannotSaveFile) {
        super(cannotSaveFile);
    }
}
