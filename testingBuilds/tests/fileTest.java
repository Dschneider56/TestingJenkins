import org.junit.Test;

import static org.junit.Assert.*;

public class fileTest {
  @Test
  public void getName() {
    file coolName = new file("coolName");
    assertEquals("coolName", coolName.getName());
    
  }
}