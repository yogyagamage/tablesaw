package tech.tablesaw.io.jsonl;

import java.io.StringReader;
import org.junit.jupiter.api.Test;

public class JsonlReaderconvertObjects_ObjectMapperwriteValueAsStringFikaTest {

  @Test
  public void test() throws Exception {
    JsonlReader jsonlReader = new JsonlReader();

    JsonlReadOptions options =
        JsonlReadOptions.builder(new StringReader("{\"field\":\"value\"}")).build();

    jsonlReader.read(options);
  }
}
