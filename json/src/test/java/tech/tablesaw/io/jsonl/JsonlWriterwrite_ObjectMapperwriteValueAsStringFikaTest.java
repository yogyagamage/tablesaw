package tech.tablesaw.io.jsonl;

import java.io.StringWriter;
import java.io.Writer;
import org.junit.jupiter.api.Test;
import tech.tablesaw.api.Table;

public class JsonlWriterwrite_ObjectMapperwriteValueAsStringFikaTest {

  @Test
  public void testWrite() throws Exception {
    JsonlWriter writer = new JsonlWriter();

    Table table = Table.create("test");
    table.addColumns(
        tech.tablesaw.api.StringColumn.create("col1", new String[] {"a", "b"}),
        tech.tablesaw.api.IntColumn.create("col2", new int[] {1, 2}));

    Writer stringWriter = new StringWriter();
    JsonlWriteOptions options = JsonlWriteOptions.builder(stringWriter).build();

    writer.write(table, options);
  }
}
