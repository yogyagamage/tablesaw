package tech.tablesaw.io.json;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tech.tablesaw.io.WriterRegistry;

class JsonWritermethod_ObjectMapperregisterModuleFikaTest {

  @Test
  void testRegisterPath() {
    WriterRegistry mockRegistry = Mockito.mock(WriterRegistry.class);
    JsonWriter.register(mockRegistry);
  }
}
