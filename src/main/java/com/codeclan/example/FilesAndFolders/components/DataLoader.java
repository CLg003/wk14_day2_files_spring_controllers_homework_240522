package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("Claire");
        userRepository.save(user1);

        User user2 = new User("Ethan");
        userRepository.save(user2);

        User user3 = new User("Gordon");
        userRepository.save(user3);

        Folder folder1 = new Folder("My Folder", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Holidays", user3);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Projects", user2);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Homework", user2);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("Games", user3);
        folderRepository.save(folder5);

        File file1 = new File("homework", ".doc", 54, folder4);
        fileRepository.save(file1);

        File file2 = new File("Chamonix", ".txt", 18, folder2);
        fileRepository.save(file2);

        File file3 = new File("Ibiza", ".doc", 32, folder2);
        fileRepository.save(file3);

        File file4 = new File("Python Project", ".py", 900, folder3);
        fileRepository.save(file4);

        File file5 = new File("homework", ".java", 45, folder1);
        fileRepository.save(file5);

        File file6 = new File("Unity", ".py", 390, folder5);
        fileRepository.save(file6);

        File file7 = new File("Tetris", ".java", 1000, folder5);
        fileRepository.save(file7);
    }
}
