package org.jgb.quarkus;

import io.quarkus.amazon.lambda.test.LambdaClient;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingFunctionTest {

    @Test
    public void testSimpleLambdaSuccess() throws Exception {
        var out = LambdaClient.invoke(String.class, "Bill");
        Assertions.assertEquals("Enter Serverless Functions with Quarkus, Bill", out);
    }

}