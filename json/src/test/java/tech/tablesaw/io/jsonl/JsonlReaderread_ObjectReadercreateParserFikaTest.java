package tech.tablesaw.io.jsonl;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.Source;

class JsonlReaderread_ObjectReadercreateParserFikaTest {

  @Test
  void test() throws IOException {
    JsonlReader instance = new JsonlReader();

    String jsonlContent = "{\"column1\":\"value1\"}\n{\"column1\":\"value2\"}";
    Reader stringReader = new StringReader(jsonlContent);

    JsonlReadOptions options = JsonlReadOptions.builder(new Source(stringReader)).build();

    Table result = instance.read(options);
  }
}
