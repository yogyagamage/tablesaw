package tech.tablesaw.io.jsonl;

import java.io.IOException;
import java.io.Writer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.Destination;

class JsonlWritermethod_ObjectMapperregisterModuleFikaTest {

  @Test
  void testWritePath() throws IOException {
    // Create mock objects for required parameters
    Table mockTable = Mockito.mock(Table.class);
    Destination mockDestination = Mockito.mock(Destination.class);
    Writer mockWriter = Mockito.mock(Writer.class);

    // Configure mock behavior to avoid NPE during execution
    Mockito.when(mockTable.rowCount()).thenReturn(2);
    Mockito.when(mockTable.columnCount()).thenReturn(1);
    Mockito.when(mockTable.column(0)).thenReturn(Mockito.mock(tech.tablesaw.columns.Column.class));
    Mockito.when(mockTable.column(0).name()).thenReturn("column1");
    Mockito.when(mockTable.get(0, 0)).thenReturn("value1");
    Mockito.when(mockTable.get(1, 0)).thenReturn("value2");

    Mockito.when(mockDestination.createWriter()).thenReturn(mockWriter);

    // Create JsonlWriter instance using the provided constructor
    JsonlWriter writer = new JsonlWriter();

    // Create WriteOptions using the builder pattern
    JsonlWriteOptions options = JsonlWriteOptions.builder(mockDestination).build();

    // Invoke the entry point method which will trigger the static initializer
    // and ultimately call ObjectMapper.registerModule
    writer.write(mockTable, options);
  }
}
