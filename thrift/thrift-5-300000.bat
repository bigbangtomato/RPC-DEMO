java -Xms2G -Xmx2G -classpath ./out/production/thrift  -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:gc5.log -Dwrite.statistics=true -Djava.ext.dirs="./lib" com.th.hello.test.THTest 5 300000 > benchmark5.log
pause