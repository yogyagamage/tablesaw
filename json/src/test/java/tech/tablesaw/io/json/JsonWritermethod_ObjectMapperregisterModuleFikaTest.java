package tech.tablesaw.io.json;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import tech.tablesaw.io.WriterRegistry;

public class JsonWritermethod_ObjectMapperregisterModuleFikaTest {

  @Test
  public void test() {
    WriterRegistry mockRegistry = mock(WriterRegistry.class);
    JsonWriter.register(mockRegistry);
  }
}
