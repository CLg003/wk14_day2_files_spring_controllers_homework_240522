package com.codeclan.example.FilesAndFolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size_kb")
    private int sizeKb;

    @ManyToOne
    @JsonIgnoreProperties({"files"})
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;


    public File(String name, String extension, int sizeKb, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.sizeKb = sizeKb;
        this.folder = folder;
    }

    public File() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSizeKb() {
        return sizeKb;
    }

    public void setSizeKb(int sizeKb) {
        this.sizeKb = sizeKb;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
