package Task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class TexrDocument implements IDocument{
    private int num = 1;
    private String fileName;
    private String fileText;
    @Override
    public void New() {
        fileName = "TextFile" + String.valueOf(num) + ".txt";
        num++;
        try{
            Files.createFile(Path.of("D:\\" + fileName));
            System.out.println("Файл успешно создан");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void Open() {
        try (FileInputStream f = new FileInputStream("D:\\" + fileName)) {
            System.out.println("Содержимое файла:");
            int b;
            do {
                b = f.read();
                if (b != -1) {
                    System.out.print((char) b); }
            } while (b != -1);
        } catch (IOException e) { e.printStackTrace(); }
    }


    @Override
    public void Save() {
        if (fileText !=""){
            try(FileWriter writer = new FileWriter("d:\\" + fileName, true)){
                String lineSeparator = System.getProperty("line.separator");
                writer.write(fileText + lineSeparator);
                writer.flush();
                System.out.println("Изменения в файле сохранены!");
            } catch(IOException ex) { System.out.println(ex.getMessage()); }
        }
        fileText = "";
    }

    @Override
    public void Exit() {
        System.out.println("Выход из программы!");
        System.exit(0);
    }
}
