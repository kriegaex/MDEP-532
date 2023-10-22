# Reproducer for MDEP-532

Please note how the test uses the undeclared (transitive) dependency `commons-logging:commons-logging:jar:1.1.3:test`, introduced by test dependency `org.springframework:spring-core:jar:3.2.18.RELEASE:test`, provoking the behaviour described in [MDEP-532](https://issues.apache.org/jira/browse/MDEP-532).

Simply run `mvn clean verify`.
