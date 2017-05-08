Java-junit-sample
-----------
It's a simple calculator project to demo how to use junit4. And you
also can use it to generate test report and code coverage report.

Usage
-----------
* Open command line
* Check the gradle tasks

```no-highlight
    $ ./gradlew -q tasks
```

* Run your test and generate test code coverage report
    - Support Chrome and Firefox
* Run specific test case

```no-highlight
    $ ./gradlew clean test jacocoTestReport
```

* Report(Xml and Html) will be generated on build folder

Integrate with Jenkins
-----------
* Install essential plugin to publish report
    * Gradle plugin
    * HTML Publisher plugin
    * Jacoco plugin
    * JUnit plugin