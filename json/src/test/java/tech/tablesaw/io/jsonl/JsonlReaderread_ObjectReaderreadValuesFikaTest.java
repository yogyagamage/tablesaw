package tech.tablesaw.io.jsonl;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import tech.tablesaw.api.Table;

class JsonlReaderread_ObjectReaderreadValuesFikaTest {

  @Test
  void test() throws IOException {
    JsonlReader jsonlReader = new JsonlReader();

    String jsonlContent = "{\"name\":\"test\"}\n{\"name\":\"test2\"}";
    Reader reader = new StringReader(jsonlContent);

    JsonlReadOptions options = JsonlReadOptions.builder(reader).build();

    Table result = jsonlReader.read(options);
  }
}
