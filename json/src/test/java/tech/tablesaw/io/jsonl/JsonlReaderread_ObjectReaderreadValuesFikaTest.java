package tech.tablesaw.io.jsonl;

import java.io.*;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class JsonlReaderread_ObjectReaderreadValuesFikaTest {

  @Test
  public void testRead(@TempDir Path tempDir) throws IOException {
    JsonlReader reader = new JsonlReader();

    File tempFile = tempDir.resolve("test.jsonl").toFile();
    try (PrintWriter writer = new PrintWriter(tempFile)) {
      writer.println("{\"name\":\"test\",\"value\":1}");
    }

    JsonlReadOptions options = JsonlReadOptions.builder(tempFile).build();
    reader.read(options);
  }
}
