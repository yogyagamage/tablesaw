package tech.tablesaw.io.json;

import java.io.IOException;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import tech.tablesaw.api.Table;

public class JsonReaderconvertArrayOfObjects_ObjectMapperwriteValueAsStringFikaTest {

  @Test
  public void testReadCallsConvertArrayOfObjectsCallsWriteValueAsString() throws IOException {
    JsonReader jsonReader = new JsonReader();

    String jsonContent = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Jane\",\"age\":25}]";
    JsonReadOptions options =
        JsonReadOptions.builder(new StringReader(jsonContent)).tableName("testTable").build();

    Table result = jsonReader.read(options);
  }
}
