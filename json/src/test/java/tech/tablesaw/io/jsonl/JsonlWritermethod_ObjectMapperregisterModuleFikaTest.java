package tech.tablesaw.io.jsonl;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import tech.tablesaw.io.WriterRegistry;

public class JsonlWritermethod_ObjectMapperregisterModuleFikaTest {

  @Test
  public void testRegisterTriggersObjectMapperRegisterModule() {
    WriterRegistry mockRegistry = mock(WriterRegistry.class);
    JsonlWriter writer = new JsonlWriter();
    JsonlWriter.register(mockRegistry);
  }
}
