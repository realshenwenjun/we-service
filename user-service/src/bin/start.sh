#!/bin/sh

LOG_ROOT="/home/service/logs"
echo "LOG_ROOT=${LOG_ROOT}"

JAVA_OPTS=" -Xmx500m -Xms500m"

touch ${LOG_ROOT}/out.log
java ${JAVA_OPTS}  -jar ../build/user-service-1.0-SNAPSHOT.jar >> ${LOG_ROOT}/out.log &

echo "-------------------------[started]"
