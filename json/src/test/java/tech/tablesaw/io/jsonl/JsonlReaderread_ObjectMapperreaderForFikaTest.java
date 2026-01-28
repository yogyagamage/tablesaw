package tech.tablesaw.io.jsonl;

import java.io.StringReader;
import org.junit.jupiter.api.Test;
import tech.tablesaw.api.Table;

public class JsonlReaderread_ObjectMapperreaderForFikaTest {

  @Test
  public void test() {
    JsonlReader jsonlReader = new JsonlReader();

    JsonlReadOptions options =
        JsonlReadOptions.builder(new StringReader("{\"field\":\"value\"}")).build();

    Table result = jsonlReader.read(options);
  }
}
