package tech.tablesaw.io.json;

import java.io.Writer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.Destination;

public class JsonWritermethod_ObjectMapperregisterModuleFikaTest {

  @Test
  public void testWriteTriggersObjectMapperRegisterModule() throws Exception {
    // Create a mock Table
    Table mockTable = Mockito.mock(Table.class);
    Mockito.when(mockTable.rowCount()).thenReturn(1);
    Mockito.when(mockTable.columnCount()).thenReturn(1);
    Mockito.when(mockTable.column(0)).thenReturn(Mockito.mock(tech.tablesaw.columns.Column.class));
    Mockito.when(mockTable.column(0).name()).thenReturn("testColumn");
    Mockito.when(mockTable.get(0, 0)).thenReturn("testValue");

    // Create a mock Destination
    Destination mockDestination = Mockito.mock(Destination.class);
    Writer mockWriter = Mockito.mock(Writer.class);
    Mockito.when(mockDestination.createWriter()).thenReturn(mockWriter);

    // Create JsonWriteOptions using builder pattern
    JsonWriteOptions options =
        JsonWriteOptions.builder(mockDestination).asObjects(false).header(false).build();

    // Instantiate JsonWriter using the provided constructor
    JsonWriter jsonWriter = new JsonWriter();

    // Call the entry point method
    jsonWriter.write(mockTable, options);
  }
}
