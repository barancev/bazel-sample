package foo;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Response;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.asynchttpclient.Dsl.*;

public class FooTest {

  AsyncHttpClient client;

  @Before
  public void setup() {
    client = asyncHttpClient();
  }

  @Test
  public void test1() throws ExecutionException, InterruptedException {
    Future<Response> whenResponse = client.prepareGet("https://www.seleniumhq.org/").execute();
    Response response = whenResponse.get();
  }
}
