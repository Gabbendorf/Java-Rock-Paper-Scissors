package ui;

import language.English;
import language.Language;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class DoubleUi extends Ui {

    public DoubleUi(PrintStream output, InputStream input, Language language) {
        super(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream("".getBytes()), new English());
    }

    @Override
    public String promptForMove() {
        return "paper";
    }
}
