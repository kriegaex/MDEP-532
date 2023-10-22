package org.example;

import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;

public class MyTest {
  @Test
  public void test() {
    // Use undeclared (transitive) dependency 'commons-logging:commons-logging:jar:1.1.3:test',
    // introduced by test dependency 'org.springframework:spring-core:jar:3.2.18.RELEASE:test',
    // provoking the behaviour described in https://issues.apache.org/jira/browse/MDEP-532.
    LogFactory.getLog(getClass()).info("Hello world");
    Assert.assertEquals(2, 1 + 1);
  }
}
