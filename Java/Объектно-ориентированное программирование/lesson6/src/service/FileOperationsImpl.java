package service;

import model.FamilyTree;
import java.io.*;

public class FileOperationsImpl<T> implements FileOperations<T> {
    @Override
    public void saveToFile(FamilyTree<T> familyTree, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(familyTree);
        }
    }
}
