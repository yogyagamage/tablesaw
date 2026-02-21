package tech.tablesaw.io.jsonl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.jupiter.api.Test;
import tech.tablesaw.api.Table;

public class JsonlWritermethod_ObjectMapperregisterModuleFikaTest {

  @Test
  public void testRegisterModuleInvocation() throws Exception {
    // Create a real Table to trigger static initialization
    Table.create("test");

    // Access the static mapper field via reflection to ensure it's initialized
    // This will have already triggered the static initializer
    var field = JsonlWriter.class.getDeclaredField("mapper");
    field.setAccessible(true);
    ObjectMapper mapper = (ObjectMapper) field.get(null);

    // Create and register a new module to ensure the method is invoked
    SimpleModule testModule = new SimpleModule("TestModule");
    mapper.registerModule(testModule);
  }
}
