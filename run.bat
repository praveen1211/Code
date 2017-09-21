et projectLocation=D:\Nikhil\vsts-agent-win7-x64-2.122.1\_work\1\s
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*;
java org.testng.TestNG %projectLocation%\testng1.xml
pause
