package week5.classwork.sep2;

import java.io.FileNotFoundException;

public interface Executable {

    void execute() throws FileNotFoundException;
    ExecutableType getType();
}
