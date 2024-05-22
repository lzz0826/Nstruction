#!/bin/bash

#刪除歷史數據
rm -rf java-server

#獲取傳輸的參數
appname=$1
echo "arg

#獲取正在運行的java包pid
pid=`ps -ef | grep $1 | grep 'java -jar' | awk '{printf $2}'`

echo $pid

#如果pid為空 提示一下 否折 執行kill命令
if [ -z "$pid" ];
#使用-z 空直判斷
        then
               echo "$appname not started"
        
        else
               #刪除舊的java線程
               kill -9 $pid
                echo "$appname stoping...."
fi

check=`ps -ef | grep -w $pid | grep java`
if [ -z "$check" ];
        then
               echo "$appname pid:$pid id stop"
        else
               echo "$appname stop failed"

fi