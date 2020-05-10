#!/bin/bash
echo 'Starting the DemoSpringBoot Application'
JAVA_HOME='/usr/java/jdk1.8.0_144'
DLOG_DIR='/var/opt/Example/DemoSpringBoot/'
DLOG_FILE='DemoSpringBoot.log'
CLASSPATH='/opt/DemoSpringBoot/etc/*:/opt/DemoSpringBoot/lib/*'

echo "JAVA_HOME:$JAVA_HOME \n
	DLOG_DIR:$DLOG_DIR \n
	DLOG_FIL:$DLOG_FIL \n
	CLASSPATH:$CLASSPATH \n "

$JAVA_HOME/bin/java \
	-DAPP=Springboot \
	-DLOG_DIR=$DLOG_DIR \
	-DLOG_FILE=$DLOG_FILE \
	-DLOG_LEVEL=INFO \
	-classpath $CLASSPATH \
	com.example.springboot.SpringbootApplication > /dev/null 2>&1 &
