package tech.tablesaw.io.json;

import java.io.StringWriter;
import org.junit.jupiter.api.Test;
import tech.tablesaw.api.Table;

public class JsonWriterwrite_ObjectNodesetFikaTest {

  @Test
  public void testWritePath() {
    JsonWriter writer = new JsonWriter();

    Table table = Table.create("testTable");
    table.addColumns(
        tech.tablesaw.api.StringColumn.create("col1", new String[] {"value1"}),
        tech.tablesaw.api.IntColumn.create("col2", new int[] {42}));

    StringWriter stringWriter = new StringWriter();
    JsonWriteOptions options =
        JsonWriteOptions.builder(stringWriter).asObjects(true).header(false).build();

    writer.write(table, options);
  }
}
