#!/bin/bash

#java设置
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export PATH=$JAVA_HOME/bin:$PATH:/sbin:/bin:/usr/sbin:/usr/bin:/usr/X11R6/bin

BASE_PATH=`cd "$(dirname "$0")"; pwd`
APP_PATH=`cd "$(dirname "$BASE_PATH")"; pwd`
export APP_PATH

sh $BASE_PATH/server.sh start

if [ $? -eq 0 ];then
  exit 0
else
	exit -1
fi