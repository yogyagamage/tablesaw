package tech.tablesaw.io.jsonl;

import java.io.*;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import tech.tablesaw.api.Table;

class JsonlReaderread_ObjectMapperreaderForFikaTest {

  @Test
  void testRead(@TempDir Path tempDir) throws IOException {
    JsonlReader reader = new JsonlReader();

    File tempFile = tempDir.resolve("test.jsonl").toFile();
    try (PrintWriter writer = new PrintWriter(tempFile)) {
      writer.println("{\"name\":\"test\",\"value\":123}");
    }

    JsonlReadOptions options = JsonlReadOptions.builder(new FileReader(tempFile)).build();

    Table result = reader.read(options);
  }
}
