There are two classes which can run the test:
src/test/java/testRunner/junitTestRun which uses simple junit to run the test
src/test/java/testRunner/cucumberTestRun - I have tried to use cucumber frame work to run the test.

Both tests run but they fail because the last assertion is failing on the url as the page have to be 'same as the starting page'
this can be fixed by adding extra step by clicking on 'continue to room options" button which will bring the user back to the starting url but without the "&state=AwoUKFAAIKSCaCeCjLYYEIABgHA" part.
