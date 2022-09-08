package design_patterns.behavioral.command;

public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();
}