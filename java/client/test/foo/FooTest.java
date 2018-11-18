package foo;

import org.junit.Assert;
import org.junit.Test;

public class FooTest {
  @Test
  public void test1() {
    Assert.assertTrue(new Foo().foo().contains("cat"));
  }
}
